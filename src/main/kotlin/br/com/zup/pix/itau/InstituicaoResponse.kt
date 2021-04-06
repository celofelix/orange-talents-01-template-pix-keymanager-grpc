package br.com.zup.pix.itau

import io.micronaut.core.annotation.Introspected

@Introspected
data class InstituicaoResponse(
    val nome: String,
    val ispb: String
) {

}