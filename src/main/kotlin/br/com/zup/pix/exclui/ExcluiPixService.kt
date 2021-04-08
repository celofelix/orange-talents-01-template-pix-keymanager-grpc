package br.com.zup.pix.exclui

import br.com.zup.pix.bcb.DeletePixKeyRequest
import br.com.zup.pix.clients.BancoCentralClient
import br.com.zup.pix.excecoes.ChaveNaoExistenteException
import br.com.zup.pix.excecoes.ContaNaoExistenteException
import br.com.zup.pix.repositories.PixRepository
import br.com.zup.pix.validacoes.ValidUUID
import io.micronaut.http.HttpStatus
import io.micronaut.validation.Validated
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton
import javax.transaction.Transactional
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Validated
@Singleton
class ExcluiPixService(
    @Inject val pixRepository: PixRepository,
    @Inject val bcbClient: BancoCentralClient
) {

    @Transactional
    fun remove(
        @NotBlank @NotNull pixId: String,
        @NotBlank @ValidUUID(message = "ID do cliente está em formato inválido e preenchido") clienteId: String?
    ) {
        val idPix = pixId.toLong()
        val idCliente = UUID.fromString(clienteId)

        val pix = pixRepository.findByIdAndClienteId(idPix, idCliente)
        if (pix.isEmpty) {
            throw ContaNaoExistenteException("Chave Pix informada não existe ou não pertence ao cliente informado")
        }

        pixRepository.deleteById(idPix)

        val deleteRequest = DeletePixKeyRequest(pix.get().chave, pix.get().conta.ispb)

        val deleteResponse = bcbClient
            .deleta(chave = pix.get().chave, request = deleteRequest)

        println(deleteResponse)

        if (deleteResponse.status != HttpStatus.OK) {
            throw ChaveNaoExistenteException("Ocorreu um erro ao deletar a sua chave pix no Banco Central")
        }
    }
}