package br.com.zup.pix.exclui

import br.com.zup.ExcluiChavePixRequest
import br.com.zup.KeyManagerExcluiGrpcServiceGrpc
import br.com.zup.pix.bcb.DeletePixKeyRequest
import br.com.zup.pix.bcb.DeletePixKeyResponse
import br.com.zup.pix.clients.BancoCentralClient
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
import io.micronaut.http.HttpResponse
import io.micronaut.test.annotation.MockBean
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import java.time.LocalDateTime
import java.util.*
import javax.inject.Inject

@MicronautTest(transactional = false)
class ExcluiPixEndPointTest(
    val pixRepository: PixRepository,
    val grpcClient: KeyManagerExcluiGrpcServiceGrpc.KeyManagerExcluiGrpcServiceBlockingStub
) {

    @Inject
    lateinit var bcbClient: BancoCentralClient

    private lateinit var chave: Pix

    @BeforeEach
    fun set() {
        chave = pixRepository.save(pix())
    }

    @AfterEach
    fun delete() {
        pixRepository.deleteAll()
    }

    companion object {
        val CLIENTE_ID: UUID = UUID.randomUUID()
    }

    @Test
    fun `deve excluir uma chave existente`() {

        /* Simulando o corportamento de exclusão do cliente BCB
        Com retorno de resposta da exclusão */

        Mockito.`when`(
            bcbClient.deleta(
                chave = "marcelo@gmail.com",
                DeletePixKeyRequest(key = "marcelo@gmail.com", participant = "60701190")
            )
        ).thenReturn(
            HttpResponse.ok(
                DeletePixKeyResponse(
                    key = "marcelo@gmail.com",
                    participant = "60701190", deletedAt = LocalDateTime.now()
                )
            )
        )

        /* Executando a execução da requisção para exclusão da chave */
        val excluiResponse = grpcClient.exclui(
            ExcluiChavePixRequest.newBuilder()
                .setPixId(chave.id.toString())
                .setClienteId(chave.clienteId.toString())
                .build()
        )

        /* Validando os dados da resposta são os mesmo da requisção */
        with(excluiResponse) {
            Assertions.assertEquals(chave.id.toString(), pixId)
            Assertions.assertEquals(chave.clienteId.toString(), clienteId)
        }
    }

    @MockBean(BancoCentralClient::class)
    fun bcbClient(): BancoCentralClient? {
        return Mockito.mock(BancoCentralClient::class.java)
    }

    @Factory
    class Client {
        @Bean
        fun set(@GrpcChannel(GrpcServerChannel.NAME) channel: ManagedChannel):
                KeyManagerExcluiGrpcServiceGrpc.KeyManagerExcluiGrpcServiceBlockingStub {
            return KeyManagerExcluiGrpcServiceGrpc.newBlockingStub(channel)
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
            )
        )
    }

}