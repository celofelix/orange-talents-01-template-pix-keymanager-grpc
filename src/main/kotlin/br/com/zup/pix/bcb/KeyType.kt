package br.com.zup.pix.bcb

import br.com.zup.pix.itau.TipoChave

enum class KeyType {

    CPF,
    PHONE,
    EMAIL,
    RANDOM;

    companion object {
        fun by(domainType: TipoChave): KeyType {
            return when (domainType) {
                TipoChave.CPF -> CPF
                TipoChave.CELULAR -> PHONE
                TipoChave.EMAIL -> EMAIL
                TipoChave.ALEATORIA -> RANDOM
            }
        }
    }
}