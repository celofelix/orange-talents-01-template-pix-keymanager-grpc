package br.com.zup.pix.bcb

import java.time.LocalDateTime

class CreatePixKeyResponse(
    val keyType: KeyType,
    val key: String,
    val bankAccount: BankAccount,
    val owner: Owner,
    val createdAt: LocalDateTime
)