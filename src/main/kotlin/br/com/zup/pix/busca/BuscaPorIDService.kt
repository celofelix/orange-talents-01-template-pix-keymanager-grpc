package br.com.zup.pix.busca

import br.com.zup.pix.excecoes.ContaNaoExistenteException
import br.com.zup.pix.itau.Pix
import br.com.zup.pix.repositories.PixRepository
import io.micronaut.validation.Validated
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton
import javax.transaction.Transactional

@Validated
@Singleton
class BuscaPorIDService(@Inject val pixRepository: PixRepository) {

    @Transactional
    fun busca(pixId: String?, clienteId: String?): Pix {

        val idPix = pixId?.toLong()
        val idCliente = UUID.fromString(clienteId)

        val pix = pixRepository.findByIdAndClienteId(idPix = idPix, idCliente = idCliente)
        if (pix.isEmpty) {
            throw ContaNaoExistenteException("Chave Pix informada não existe ou não pertence ao cliente informado")
        }
        return pix.get()
    }
}