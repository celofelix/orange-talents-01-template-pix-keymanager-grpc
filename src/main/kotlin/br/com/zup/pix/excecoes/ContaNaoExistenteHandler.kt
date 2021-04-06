package br.com.zup.pix.excecoes

import io.grpc.Status
import javax.inject.Singleton

@Singleton
class ContaNaoExistenteHandler : ExceptionHandler<ContaNaoExistenteException> {

    override fun handle(e: ContaNaoExistenteException): ExceptionHandler.StatusWrapper {
        return ExceptionHandler.StatusWrapper(
            Status.NOT_FOUND
                .withDescription(e.message)
                .withCause(e)
        )
    }

    override fun supports(e: Exception): Boolean {
        return e is ContaNaoExistenteException
    }
}