package br.com.zup.pix.bcb

import br.com.zup.pix.itau.Conta
import br.com.zup.pix.itau.Pix
import br.com.zup.pix.itau.TipoChave
import br.com.zup.pix.itau.TipoConta
import java.time.LocalDateTime

class PixKeyDetailsResponse(
    val keyType: KeyType,
    val key: String,
    val bankAccount: BankAccount,
    val owner: Owner,
    val createdAt: LocalDateTime
) {
    fun toPix(): Pix {

        return Pix(
            clienteId = null,
            tipoDeChave = when (keyType) {
                KeyType.CPF -> TipoChave.CPF
                KeyType.PHONE -> TipoChave.CELULAR
                KeyType.EMAIL -> TipoChave.EMAIL
                KeyType.RANDOM -> TipoChave.ALEATORIA
            },
            chave = key,
            tipoDeConta = when (bankAccount.accountType) {
                AccountType.CACC -> TipoConta.CONTA_CORRENTE
                AccountType.SVGS -> TipoConta.CONTA_POUPANCA
            },
            conta = Conta(
                instituicao = "",
                ispb = bankAccount.participant,
                agencia = bankAccount.branch,
                numero = bankAccount.accountNumber,
                nome = owner.name,
                cpf = owner.taxIdNumber
            ),
            criadaEm = createdAt
        )
    }
}