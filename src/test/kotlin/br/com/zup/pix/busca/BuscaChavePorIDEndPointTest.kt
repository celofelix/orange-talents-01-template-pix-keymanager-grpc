package br.com.zup.pix.busca

import br.com.zup.BuscaChavePorIDPixRequest
import br.com.zup.KeyManagerBuscaChavePorIDGrpcServiceGrpc
import br.com.zup.pix.itau.Conta
import br.com.zup.pix.itau.Pix
import br.com.zup.pix.itau.TipoChave
import br.com.zup.pix.itau.TipoConta
import br.com.zup.pix.repositories.PixRepository
import io.grpc.ManagedChannel
import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import io.micronaut.grpc.server.GrpcServerChannel
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.util.*

@MicronautTest(transactional = false)
class BuscaChavePorIDEndPointTest(
    val repository: PixRepository,
    val grpcClient: KeyManagerBuscaChavePorIDGrpcServiceGrpc.KeyManagerBuscaChavePorIDGrpcServiceBlockingStub
) {

    companion object {
        val CLIENTE_ID = UUID.randomUUID()
    }

    private lateinit var chave: Pix

    @BeforeEach
    fun set() {
        chave = repository.save(pix())
    }

    @Test
    fun `deve buscar chave existente atraves de clienteID e pixID`() {

        val pix = repository.findByIdAndClienteId(chave.id, chave.clienteId).get()

        val response = grpcClient.buscaChavePorID(
            BuscaChavePorIDPixRequest.newBuilder()
                .setClienteId(chave.clienteId.toString())
                .setPixId(chave.id.toString())
                .build()
        )

        println(response.clienteId)
        

        with(response) {
            Assertions.assertEquals(pix.id.toString(), response.pixId)
            Assertions.assertEquals(pix.clienteId.toString(), response.clienteId)
            Assertions.assertEquals(pix.tipoDeChave.name, response.tipoDeChave)
            Assertions.assertEquals(pix.chave, response.chave)
            Assertions.assertEquals(pix.conta.nome, response.conta.titular)
            Assertions.assertEquals(pix.conta.cpf, response.conta.cpf)
            Assertions.assertEquals(pix.conta.instituicao, response.conta.instituicao)
            Assertions.assertEquals(pix.conta.agencia, response.conta.agencia)
            Assertions.assertEquals(pix.conta.numero, response.conta.numeroConta)
            Assertions.assertEquals(pix.tipoDeConta.name, response.conta.tipo)
        }

    }


    private fun pix(): Pix {
        return Pix(
            clienteId = CLIENTE_ID,
            tipoDeChave = TipoChave.EMAIL,
            chave = "marcelo@gmail.com",
            tipoDeConta = TipoConta.CONTA_CORRENTE,
            conta = Conta(
                instituicao = "ITAÚ UNIBANCO S.A.",
                ispb = "60701190",
                agencia = "0001",
                numero = "291900",
                nome = "Marcelo Felix",
                cpf = "02467781054"
            ),
        )
    }

    @Factory
    class Client {
        @Bean
        fun client(@GrpcChannel(GrpcServerChannel.NAME) channel: ManagedChannel): KeyManagerBuscaChavePorIDGrpcServiceGrpc.KeyManagerBuscaChavePorIDGrpcServiceBlockingStub {
            return KeyManagerBuscaChavePorIDGrpcServiceGrpc.newBlockingStub(channel)
        }
    }

}