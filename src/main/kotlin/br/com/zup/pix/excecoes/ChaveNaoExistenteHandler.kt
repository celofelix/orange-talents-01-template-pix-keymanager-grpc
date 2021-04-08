package br.com.zup.pix.excecoes

import io.grpc.Status
import javax.inject.Singleton

@Singleton
class ChaveNaoExistenteHandler : ExceptionHandler<ChaveNaoExistenteException> {

    override fun handle(e: ChaveNaoExistenteException): ExceptionHandler.StatusWithDetails {
        return ExceptionHandler.StatusWithDetails(
            Status.NOT_FOUND
                .withDescription(e.message)
                .withCause(e)
        )
    }

    override fun supports(e: Exception): Boolean {
        return e is ChaveNaoExistenteException
    }

}