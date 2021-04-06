package br.com.zup.pix.bcb

import br.com.zup.pix.itau.TipoConta

enum class AccountType {

    CACC,
    SVGS;

    companion object {
        fun by(domainType: TipoConta): AccountType {
            return when (domainType) {
                TipoConta.CONTA_CORRENTE -> CACC
                TipoConta.CONTA_POUPANCA -> SVGS
            }
        }
    }
}