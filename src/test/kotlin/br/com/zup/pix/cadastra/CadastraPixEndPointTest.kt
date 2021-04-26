package br.com.zup.pix.cadastra

import br.com.zup.CadastraChavePixRequest
import br.com.zup.KeyManagerCadastraGrpcServiceGrpc
import br.com.zup.TipoDeChave
import br.com.zup.TipoDeConta
import br.com.zup.pix.bcb.*
import br.com.zup.pix.clients.BancoCentralClient
import br.com.zup.pix.clients.ContasClientesItauClient
import br.com.zup.pix.itau.*
import br.com.zup.pix.repositories.PixRepository
import io.grpc.ManagedChannel
import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import io.micronaut.grpc.server.GrpcServerChannel
import io.micronaut.http.HttpResponse
import io.micronaut.test.annotation.MockBean
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.mockito.Mockito
import java.time.LocalDateTime
import java.util.*
import javax.inject.Inject

@MicronautTest(transactional = false)
class CadastraPixEndPointTest(
    val repository: PixRepository,
    val grpcClient: KeyManagerCadastraGrpcServiceGrpc.KeyManagerCadastraGrpcServiceBlockingStub
) {

    @Inject
    lateinit var bcbClient: BancoCentralClient

    @Inject
    lateinit var itauClient: ContasClientesItauClient

    companion object {
        val CLIENTE_ID: UUID = UUID.randomUUID()
    }

    /* Para deletar os registros da banco antes de cada método de teste */
    @BeforeEach
    fun set() {
        repository.deleteAll()
    }

    @Test
    fun `deve cadastrar nova chave pix`() {

        /* Simulando o comportamento do client do Itau para buscar os dados bancários */
        Mockito.`when`(itauClient.buscaConta(clientId = CLIENTE_ID.toString(), tipo = "CONTA_CORRENTE"))
            .thenReturn(HttpResponse.ok(dadosDaContaResponse()))

        /* Simulando o comportamento do client do BCB para cadastrar a chave */
        Mockito.`when`(bcbClient.cadastra(chavePixKeyRequest()))
            .thenReturn(HttpResponse.created(chavePixKeyResponse()))

        /* Executando a requisição para o método do endpoint */
        val response = grpcClient.registra(
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

    @Test
    fun `nao deve salvar chave pix ja existente`() {
        /* Simulando uma chave salva no banco */
        repository.save(chave())

        /* Executando a requisição para o endpoint e usando o assertThrows
        O assertThrows irá checar a exceção lançada pelo grpc
        Guardando o retorno da exceção na variavel para ser verificada
        Deve ser a StatusRunTimeException pq é o tipo de exception que o grpc lança */
        val assertThrow = assertThrows<StatusRuntimeException> {
            grpcClient.registra(
                CadastraChavePixRequest.newBuilder()
                    .setClienteId(CLIENTE_ID.toString())
                    .setTipoDeChave(TipoDeChave.EMAIL)
                    .setChave("marcelo@gmail.com")
                    .setTipoDeConta(TipoDeConta.CONTA_CORRENTE)
                    .build()
            )
        }

        /* Verificando se o erro lançado na chamada do endpoint
        O código do status deve o mapeado no ALREADY_EXISTS
        O mapeamento foi feito dentro da ChaveExistenteExceptionHandler */
        with(assertThrow) {
            Assertions.assertEquals(Status.ALREADY_EXISTS.code, status.code)
            Assertions.assertEquals("A chave informada marcelo@gmail.com já foi cadastrada", status.description)
        }
    }

    @Test
    fun `nao deve cadastrar pix se os dados bancarios nao existirem`() {

        /*Simulando o corportamente de busca do cliente Itau com retorno de não encontrada */
        Mockito.`when`(itauClient.buscaConta(CLIENTE_ID.toString(), "CONTA_CORRENTE"))
            .thenReturn(HttpResponse.notFound())

        /* Silumando a requisição para o endpoint com o retorno de  */
        val assertThrow = assertThrows<StatusRuntimeException> {
            grpcClient.registra(
                CadastraChavePixRequest.newBuilder()
                    .setClienteId(CLIENTE_ID.toString())
                    .setTipoDeChave(TipoDeChave.EMAIL)
                    .setChave("marcelo@gmail.com")
                    .setTipoDeConta(TipoDeConta.CONTA_CORRENTE)
                    .build()
            )
        }

        /* Verificando se o erro lançado na chamada do endpoint
        O código do status deve o mapeado no ALREADY_EXISTS
        O mapeamento foi feito dentro da ContaNaoExistenteHandler */
        with(assertThrow) {
            Assertions.assertEquals(Status.NOT_FOUND.code, status.code)
            Assertions.assertEquals("Conta do usuário não foi encontrada", status.description)
        }
    }

    @Test
    fun `nao deve registrar chave pix com parametros invalidos`() {

        /* Simulando o envio de um objeto vazio sem os parâmetros */
        val assertThrow = assertThrows<StatusRuntimeException> {
            grpcClient.registra(
                CadastraChavePixRequest.newBuilder()
                    .build()
            )
        }

        with(assertThrow) {
            Assertions.assertEquals(Status.INVALID_ARGUMENT.code, status.code)
            Assertions.assertEquals("Dados inválidos", status.description)
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

    private fun chave(): Pix {
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

