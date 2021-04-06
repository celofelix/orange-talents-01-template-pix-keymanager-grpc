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
class BuscaChavePorIDEndPoint(@Inject val buscaChaveService: BuscaPorIDService) :
    KeyManagerBuscaChavePorIDGrpcServiceGrpc.KeyManagerBuscaChavePorIDGrpcServiceImplBase() {

     override fun buscaChavePorID(
        request: BuscaChavePorIDPixRequest,
        responseObserver: StreamObserver<DetalhesChavePixResponse>
    ) {
        val pix = buscaChaveService.busca(request.pixId, request.clienteId)

        val criadaEm = pix.criadaEm.atZone(ZoneId.of("UTC")).toInstant()

        val detalhesChavePix = DetalhesChavePixResponse.newBuilder()
            .setPixId(pix.id.toString())
            .setClienteId(pix.clienteId.toString())
            .setTipoDeChave(pix.tipoDeChave.name)
            .setChave(pix.chave)
            .setConta(
                Conta.newBuilder()
                    .setTitular(pix.conta.nome)
                    .setCpf(pix.conta.cpf)
                    .setInstituicao(pix.conta.instituicao)
                    .setAgencia(pix.conta.agencia)
                    .setNumeroConta(pix.conta.numero)
                    .setTipo(pix.tipoDeConta.name)
                    .build())
            .setCriadaEm(
                Timestamp.newBuilder()
                    .setNanos(criadaEm.nano)
                    .setSeconds(criadaEm.epochSecond)
                    .build())
            .build()

        responseObserver.onNext(detalhesChavePix)
        responseObserver.onCompleted()
    }
}