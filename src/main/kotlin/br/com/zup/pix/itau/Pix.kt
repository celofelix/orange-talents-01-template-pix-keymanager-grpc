package br.com.zup.pix.itau

import org.hibernate.annotations.Type
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(
    uniqueConstraints =
    [UniqueConstraint(name = "chave_pix_uk", columnNames = ["chave"])]
)
class Pix(

    @Column(nullable = false)
    @Type(type = "org.hibernate.type.UUIDCharType")
    val clienteId: UUID?,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val tipoDeChave: TipoChave,

    @Column(unique = true, nullable = false)
    var chave: String,

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    val tipoDeConta: TipoConta,

    @Embedded
    val conta: Conta,

    val criadaEm: LocalDateTime = LocalDateTime.now()
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    fun atualiza(key: String) {
        this.chave = key
    }

}