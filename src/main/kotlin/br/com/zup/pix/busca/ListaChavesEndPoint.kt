package br.com.zup.pix.busca

import br.com.zup.KeyManagerListaChavesGrpcServiceGrpc
import br.com.zup.ListaChavesPixRequest
import br.com.zup.ListaChavesResponse
import br.com.zup.pix.excecoes.ChaveNaoExistenteException
import br.com.zup.pix.excecoes.ErrorHandler
import br.com.zup.pix.repositories.PixRepository
import com.google.protobuf.Timestamp
import io.grpc.stub.StreamObserver
import java.time.ZoneId
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton
import javax.validation.Valid
import javax.validation.constraints.NotBlank

@ErrorHandler
@Singleton
class ListaChavesEndPoint(@Inject val pixRepository: PixRepository) :
    KeyManagerListaChavesGrpcServiceGrpc.KeyManagerListaChavesGrpcServiceImplBase() {

    override fun listaChaves(
        request: ListaChavesPixRequest,
        responseObserver: StreamObserver<ListaChavesResponse>
    ) {

        if (request.clienteId.isNullOrBlank()) {
            throw IllegalArgumentException("O ID do cliente deve ser informado")
        }

        val idCliente = UUID.fromString(request.clienteId)

        val chaves = pixRepository.findAllByClienteId(idCliente)

        val listaChavesRespose = chaves.map {
            ListaChavesResponse.ChavesPix.newBuilder()
                .setPixId(it.id.toString())
                .setTipoChave(it.tipoDeChave.name)
                .setChave(it.chave)
                .setTipoConta(it.tipoDeConta.name)
                .setCriadaEm(
                    Timestamp.newBuilder()
                        .setNanos(it.criadaEm.atZone(ZoneId.of("UTC")).toInstant().nano)
                        .setSeconds(it.criadaEm.atZone(ZoneId.of("UTC")).toInstant().epochSecond)
                        .build()
                )
                .build()
        }
        responseObserver.onNext(
            ListaChavesResponse.newBuilder()
                .setClienteId(idCliente.toString())
                .addAllChaves(listaChavesRespose)
                .build()
        )

        responseObserver.onCompleted()
    }
}