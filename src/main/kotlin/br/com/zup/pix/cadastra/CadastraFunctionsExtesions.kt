package br.com.zup.pix.cadastra

import br.com.zup.CadastraChavePixRequest
import br.com.zup.TipoDeChave
import br.com.zup.TipoDeConta
import br.com.zup.pix.itau.NovaChave
import br.com.zup.pix.itau.TipoChave
import br.com.zup.pix.itau.TipoConta


fun CadastraChavePixRequest.toModel(): NovaChave {

    return NovaChave(
        clienteId = clienteId,
        tipoDeChave = when (tipoDeChave) {
            TipoDeChave.CHAVE_SEM_TIPO -> null
            else -> TipoChave.valueOf(tipoDeChave.name)
        },
        chave = chave,
        tipoDeConta = when (tipoDeConta) {
            TipoDeConta.CONTA_SEM_TIPO -> null
            else -> TipoConta.valueOf(tipoDeConta.name)
        }
    )
}