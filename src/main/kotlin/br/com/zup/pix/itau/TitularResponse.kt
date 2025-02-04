package br.com.zup.pix.itau

import io.micronaut.core.annotation.Introspected

@Introspected
data class TitularResponse(
    val id: String,
    val nome: String,
    val cpf: String
) {
}