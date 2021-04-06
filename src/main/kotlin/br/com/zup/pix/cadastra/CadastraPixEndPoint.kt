package br.com.zup.pix.cadastra

import br.com.zup.CadastraChavePixRequest
import br.com.zup.CadastraChavePixResponse
import br.com.zup.KeyManagerCadastraGrpcServiceGrpc
import br.com.zup.pix.excecoes.ErrorHandler
import io.grpc.stub.StreamObserver
import javax.inject.Inject
import javax.inject.Singleton

@ErrorHandler
@Singleton
class CadastraPixEndPoint(@Inject val service: NovaChaveService) :
    KeyManagerCadastraGrpcServiceGrpc.KeyManagerCadastraGrpcServiceImplBase() {

    override fun registra(
        request: CadastraChavePixRequest,
        responseObserver: StreamObserver<CadastraChavePixResponse>
    ) {
        val novaChave = request.toModel()
        val chaveCriada = service.registra(novaChave)

        responseObserver.onNext(
            CadastraChavePixResponse.newBuilder()
                .setClienteId(chaveCriada.clienteId.toString())
                .setPixId(chaveCriada.id.toString())
                .build()
        )
        responseObserver.onCompleted()
    }

}