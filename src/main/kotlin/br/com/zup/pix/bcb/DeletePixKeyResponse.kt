package br.com.zup.pix.bcb

import java.time.LocalDateTime

class DeletePixKeyResponse(
    val key: String,
    val participant: String,
    val deletedAt: LocalDateTime
)