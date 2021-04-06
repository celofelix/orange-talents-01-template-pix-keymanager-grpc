package br.com.zup.pix.itau

import br.com.zup.pix.validacoes.ValidChave
import br.com.zup.pix.validacoes.ValidUUID
import io.micronaut.core.annotation.Introspected
import java.util.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@ValidChave
@Introspected
data class NovaChave(

    @ValidUUID
    @field:NotBlank
    val clienteId: String?,
    @field:NotNull
    val tipoDeChave: TipoChave?,
    @field:Size(max = 77)
    val chave: String?,
    @field:NotNull
    val tipoDeConta: TipoConta?
) {
    fun toModel(conta: Conta): Pix {
        return Pix(
            clienteId = UUID.fromString(this.clienteId),
            tipoDeChave = TipoChave.valueOf(this.tipoDeChave!!.name),
            chave = if (this.tipoDeChave == TipoChave.ALEATORIA) UUID.randomUUID().toString() else this.chave!!,
            tipoDeConta = TipoConta.valueOf(this.tipoDeConta!!.name),
            conta = conta
        )
    }
}
