package br.com.zup.pix.busca

import br.com.zup.*
import br.com.zup.pix.excecoes.ErrorHandler
import com.google.protobuf.Timestamp
import io.grpc.stub.StreamObserver
import java.time.ZoneId
import javax.inject.Inject
import javax.inject.Singleton

@ErrorHandler
@Singleton
class BuscaPorChaveEndPoint(@Inject val buscaPorChaveService: BuscaPorChaveService) :
    KeyManagerBuscaChaveGrpcServiceGrpc.KeyManagerBuscaChaveGrpcServiceImplBase() {

    override fun buscaPorChave(
        request: BuscaPorChavePixRequest,
        responseObserver: StreamObserver<DetalhesChavePixResponse>
    ) {
        val pix = buscaPorChaveService.buscaChave(request.chave)

        val criadaEm = pix.criadaEm.atZone(ZoneId.of("UTC")).toInstant()

        val response = DetalhesChavePixResponse.newBuilder()
            .setTipoDeChave(pix.tipoDeChave.name)
            .setChave(pix.chave)
            .setConta(
                Conta.newBuilder()
                    .setTitular(pix.conta.nome)
                    .setCpf(pix.conta.cpf)
                    .setInstituicao(pix.conta.ispb)
                    .setAgencia(pix.conta.agencia)
                    .setNumeroConta(pix.conta.numero)
                    .setTipo(pix.tipoDeConta.name)
            )
            .setCriadaEm(
                Timestamp.newBuilder()
                    .setNanos(criadaEm.nano)
                    .setSeconds(criadaEm.epochSecond)
            )
            .build()

        responseObserver.onNext(response)
        responseObserver.onCompleted()
    }

}