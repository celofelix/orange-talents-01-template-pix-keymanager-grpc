package br.com.zup.pix.repositories

import br.com.zup.pix.itau.Pix
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface PixRepository : JpaRepository<Pix, Long> {

    fun existsByChave(chave: String): Boolean
    fun findByIdAndClienteId(idPix: Long?, idCliente: UUID?): Optional<Pix>
    fun findByChave(chave: String): Optional<Pix>
    fun findAllByClienteId(clienteId: UUID): List<Pix>

}