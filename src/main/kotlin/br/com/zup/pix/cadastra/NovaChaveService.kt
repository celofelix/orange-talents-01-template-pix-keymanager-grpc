package br.com.zup.pix.cadastra

import br.com.zup.pix.bcb.CreatePixKeyRequest
import br.com.zup.pix.clients.BancoCentralClient
import br.com.zup.pix.repositories.PixRepository
import br.com.zup.pix.clients.ContasClientesItauClient
import br.com.zup.pix.excecoes.ChaveExistenteException
import br.com.zup.pix.excecoes.ContaNaoExistenteException
import br.com.zup.pix.itau.NovaChave
import br.com.zup.pix.itau.Pix
import io.micronaut.http.HttpStatus
import io.micronaut.validation.Validated
import javax.inject.Inject
import javax.inject.Singleton
import javax.transaction.Transactional
import javax.validation.Valid

@Validated
@Singleton
class NovaChaveService(
    @Inject val contasItauClient: ContasClientesItauClient,
    @Inject val chaveRepository: PixRepository,
    @Inject val bcbClient: BancoCentralClient
) {
    @Transactional
    fun registra(@Valid novaChave: NovaChave): Pix {

        if (chaveRepository.existsByChave(novaChave.chave!!)) {
            throw ChaveExistenteException("A chave informada ${novaChave.chave} já foi cadastrada")
        }

        val contaResponse = contasItauClient
            .buscaConta(novaChave.clienteId!!, novaChave.tipoDeConta!!.name)

        val conta = contaResponse.body()?.toModel()
            ?: throw ContaNaoExistenteException("Conta para o usuário não foi encontrada")

        val pix = novaChave.toModel(conta)
        chaveRepository.save(pix)

        val bcbRequest = CreatePixKeyRequest.toRequest(pix = pix)

        val bcbResponse = bcbClient.cadastra(bcbRequest)
        if (bcbResponse.status != HttpStatus.CREATED) {
            throw IllegalStateException("Ocorreu um erro ao registrar a sua chave pix no Banco Central")
        }

        pix.atualiza(bcbResponse.body()!!.key)

        return pix
    }
}
