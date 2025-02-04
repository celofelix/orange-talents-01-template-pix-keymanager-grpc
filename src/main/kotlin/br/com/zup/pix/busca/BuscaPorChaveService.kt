package br.com.zup.pix.busca

import br.com.zup.pix.clients.BancoCentralClient
import br.com.zup.pix.excecoes.ChaveNaoExistenteException
import br.com.zup.pix.itau.Pix
import br.com.zup.pix.repositories.PixRepository
import io.micronaut.http.HttpStatus
import io.micronaut.validation.Validated
import javax.inject.Inject
import javax.inject.Singleton
import javax.validation.Valid
import javax.validation.constraints.NotBlank

@Validated
@Singleton
class BuscaPorChaveService(
    @Inject val pixRepository: PixRepository,
    @Inject val bcbClient: BancoCentralClient
) {

    fun buscaChave(@Valid @NotBlank chave: String): Pix {

        val possivelChave = pixRepository.findByChave(chave)

        if (possivelChave.isEmpty) {
            val bcbChave = bcbClient.buscaPorChave(chave)
            if (bcbChave.status != HttpStatus.OK) {
                throw ChaveNaoExistenteException("Chave não encontrada")
            }
            return bcbChave.body()!!.toPix()
        }

        return possivelChave.get()
    }
}