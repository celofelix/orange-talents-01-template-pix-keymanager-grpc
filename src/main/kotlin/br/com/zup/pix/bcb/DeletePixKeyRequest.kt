package br.com.zup.pix.bcb

data class DeletePixKeyRequest(
    val key: String,
    val participant: String
)