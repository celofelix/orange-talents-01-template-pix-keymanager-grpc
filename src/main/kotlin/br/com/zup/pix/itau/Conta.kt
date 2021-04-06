package br.com.zup.pix.itau

import io.micronaut.core.annotation.Introspected
import javax.persistence.Embeddable
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Introspected
@Embeddable
data class Conta(
    val instituicao: String,
    val ispb: String,
    val agencia: String,
    val numero: String,
    val nome: String,
    val cpf: String
) {
}