package br.com.zup.pix.itau

import io.micronaut.core.annotation.Introspected

@Introspected
data class ContaResponse(
    val tipo: String,
    val instituicao: InstituicaoResponse,
    val agencia: String,
    val numero: String,
    val titular: TitularResponse
) {

    fun toModel(): Conta {
        return Conta(
            instituicao = this.instituicao.nome,
            ispb = this.instituicao.ispb,
            agencia = this.agencia,
            numero = this.numero,
            nome = this.titular.nome,
            cpf = this.titular.cpf
        )
    }
}
