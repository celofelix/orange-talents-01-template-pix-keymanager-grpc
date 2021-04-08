package br.com.zup.pix.cadastra

import br.com.zup.CadastraChavePixRequest
import br.com.zup.KeyManagerCadastraGrpcServiceGrpc
import br.com.zup.TipoDeChave
import br.com.zup.TipoDeConta
import br.com.zup.pix.bcb.*
import br.com.zup.pix.clients.BancoCentralClient
import br.com.zup.pix.clients.ContasClientesItauClient
import br.com.zup.pix.itau.ContaResponse
import br.com.zup.pix.itau.InstituicaoResponse
import br.com.zup.pix.itau.TitularResponse
import io.grpc.ManagedChannel
import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import io.micronaut.grpc.server.GrpcServerChannel
import io.micronaut.http.HttpResponse
import io.micronaut.test.annotation.MockBean
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import java.time.LocalDateTime
import java.util.*
import javax.inject.Inject

@MicronautTest(transactional = false)
class CadastraPixEndPointTest(
    val grpcCliente: KeyManagerCadastraGrpcServiceGrpc.KeyManagerCadastraGrpcServiceBlockingStub
) {

    @Inject
    lateinit var bcbClient: BancoCentralClient

    @Inject
    lateinit var itauClient: ContasClientesItauClient

    companion object {
        val CLIENTE_ID: UUID = UUID.randomUUID()
    }

    @Test
    fun `deve cadastrar chave pix`() {

        /* Simulando o comportamento do client do Itau para buscar os dados bancários */
        Mockito.`when`(itauClient.buscaConta(clientId = CLIENTE_ID.toString(), tipo = "CONTA_CORRENTE"))
            .thenReturn(HttpResponse.ok(dadosDaContaResponse()))

        /* Simulando o comportamento do client do BCB para cadastrar a chave */
        Mockito.`when`(bcbClient.cadastra(chavePixKeyRequest()))
            .thenReturn(HttpResponse.created(chavePixKeyResponse()))

        /* Executando a requisição para o método do endpoint */
        val response = grpcCliente.registra(
            CadastraChavePixRequest.newBuilder()
                .setClienteId(CLIENTE_ID.toString())
                .setTipoDeChave(TipoDeChave.EMAIL)
                .setChave("marcelo@gmail.com")
                .setTipoDeConta(TipoDeConta.CONTA_CORRENTE)
                .build()
        )

        /* Validando a resposta da requisição */
        with(response) {
            Assertions.assertEquals(CLIENTE_ID.toString(), clienteId)
            Assertions.assertNotNull(pixId)
        }
    }

    private fun chavePixKeyResponse(): CreatePixKeyResponse {
        return CreatePixKeyResponse(
            keyType = KeyType.EMAIL,
            key = "marcelo@gmail.com",
            bankAccount = bankAccount(),
            owner = owner(),
            createdAt = LocalDateTime.now()
        )
    }

    private fun dadosDaContaResponse(): ContaResponse {
        return ContaResponse(
            tipo = "CONTA_CORRENTE",
            instituicao = InstituicaoResponse(nome = "ITAÚ UNIBANCO S.A.", ispb = "60701190"),
            agencia = "0001",
            numero = "291900",
            TitularResponse(
                CLIENTE_ID.toString(),
                nome = "Marcelo Felix",
                cpf = "02467781054"
            )
        )
    }

    private fun chavePixKeyRequest(): CreatePixKeyRequest {
        return CreatePixKeyRequest(
            keyType = KeyType.EMAIL,
            key = "marcelo@gmail.com",
            bankAccount = bankAccount(),
            owner = owner()
        )
    }

    private fun bankAccount(): BankAccount {
        return BankAccount(
            participant = "60701190",
            branch = "0001",
            accountNumber = "291900",
            accountType = AccountType.CACC
        )
    }

    private fun owner(): Owner {
        return Owner(
            type = Owner.OwnerType.NATURAL_PERSON,
            name = "Marcelo Felix",
            taxIdNumber = "02467781054"
        )
    }

    /* Mockando o cliente do BCB para simular os métodos */
    @MockBean(BancoCentralClient::class)
    fun bcbClient(): BancoCentralClient? {
        return Mockito.mock(BancoCentralClient::class.java)
    }

    /* Mockando o cliente do Itau para simular os métodos */
    @MockBean(ContasClientesItauClient::class)
    fun itauClient(): ContasClientesItauClient {
        return Mockito.mock(ContasClientesItauClient::class.java)
    }

    @Factory
    class ClientGrpc {
        @Bean
        fun stub(@GrpcChannel(GrpcServerChannel.NAME) channel: ManagedChannel): KeyManagerCadastraGrpcServiceGrpc.KeyManagerCadastraGrpcServiceBlockingStub {
            return KeyManagerCadastraGrpcServiceGrpc.newBlockingStub(channel)
        }
    }
}

