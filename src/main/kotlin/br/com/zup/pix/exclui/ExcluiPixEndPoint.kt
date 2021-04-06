package br.com.zup.pix.exclui

import br.com.zup.ExcluiChavePixRequest
import br.com.zup.ExcluiChavePixResponse
import br.com.zup.KeyManagerExcluiGrpcServiceGrpc
import br.com.zup.pix.excecoes.ErrorHandler
import io.grpc.stub.StreamObserver
import javax.inject.Inject
import javax.inject.Singleton

@ErrorHandler
@Singleton
class ExcluiPixEndPoint(@Inject val excluiPixService: ExcluiPixService) :
    KeyManagerExcluiGrpcServiceGrpc.KeyManagerExcluiGrpcServiceImplBase() {

    override fun exclui(
        request: ExcluiChavePixRequest,
        responseObserver: StreamObserver<ExcluiChavePixResponse>
    ) {

        excluiPixService.remove(request.pixId, request.clienteId)

        val pixResponse = ExcluiChavePixResponse.newBuilder()
            .setPixId(request.pixId)
            .setClienteId(request.clienteId)
            .build()

        responseObserver.onNext(pixResponse)
        responseObserver.onCompleted()

    }
}