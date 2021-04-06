package br.com.zup.pix.excecoes

import io.grpc.Status
import javax.inject.Singleton

@Singleton
class ChaveExistenteExceptionHandler : ExceptionHandler<ChaveExistenteException> {

    override fun handle(e: ChaveExistenteException): ExceptionHandler.StatusWrapper {
        return ExceptionHandler.StatusWrapper(
            Status.ALREADY_EXISTS
                .withDescription(e.message)
                .withCause(e)
        )
    }

    override fun supports(e: Exception): Boolean {
        return e is ChaveExistenteException
    }
}