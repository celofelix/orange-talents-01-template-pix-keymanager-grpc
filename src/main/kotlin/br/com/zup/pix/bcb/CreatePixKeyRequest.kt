package br.com.zup.pix.bcb

import br.com.zup.pix.itau.Pix

data class CreatePixKeyRequest(
    val keyType: KeyType,
    val key: String,
    val bankAccount: BankAccount,
    val owner: Owner
) {

    companion object {
        fun toRequest(pix: Pix): CreatePixKeyRequest {
            return CreatePixKeyRequest(
                keyType = KeyType.by(pix.tipoDeChave),
                key = pix.chave,
                bankAccount = BankAccount(
                    participant = pix.conta.ispb,
                    branch = pix.conta.agencia,
                    accountNumber = pix.conta.numero,
                    accountType = AccountType.by(pix.tipoDeConta)
                ),
                owner = Owner(
                    type = Owner.OwnerType.NATURAL_PERSON,
                    name = pix.conta.nome,
                    taxIdNumber = pix.conta.cpf
                )
            )
        }
    }
}