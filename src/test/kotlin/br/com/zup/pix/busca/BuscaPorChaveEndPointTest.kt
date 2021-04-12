package br.com.zup.pix.busca

import br.com.zup.BuscaPorChavePixRequest
import br.com.zup.KeyManagerBuscaChaveGrpcServiceGrpc
import br.com.zup.pix.bcb.*
import br.com.zup.pix.clients.BancoCentralClient
import br.com.zup.pix.itau.Conta
import br.com.zup.pix.itau.Pix
import br.com.zup.pix.itau.TipoChave
import br.com.zup.pix.itau.TipoConta
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
import org.junit.jupiter.api.*
import org.mockito.Mockito
import java.time.LocalDateTime
import java.util.*
import javax.inject.Inject

@MicronautTest(transactional = false)
class BuscaPorChaveEndPointTest(
        private val repository: PixRepository,
        private val grpcClient: KeyManagerBuscaChaveGrpcServiceGrpc.KeyManagerBuscaChaveGrpcServiceBlockingStub
) {

    companion object {
        val CLIENTE_ID: UUID = UUID.randomUUID()
    }

    private lateinit var pix: Pix

    @BeforeEach
    fun save() {
        pix = repository.save(chave())
    }

    @Inject
    lateinit var bcbClient: BancoCentralClient

    @Test
    fun `deve buscar buscar pela chave localmente sem buscar no servico BCB`() {

        /* Realizando a busca da chave salva
        Irá retornoar do banco local */
        val pixFound = repository.findByChave(chave = pix.chave).get()

        /* Executando a requisição para o endpoint grpc
        Irá retornar um response com os dados do banco local
        Sem buscar no serviço do BCB */
        val buscaPorChave = grpcClient.buscaPorChave(
                BuscaPorChavePixRequest.newBuilder()
                        .setChave(pixFound.chave)
                        .build()
        )

        /* Validando os dados salvos no banco com o retornado
        Nesse caso a instuição é o ISBN do banco
        O ID da chave e ID do cliente são retornados em brancos de forma opcional
        Caso seja feito o uso do serviço BCB eles não possuem o ID da chave
        Devido ser um registro interno e nem das demais informações */
        with(buscaPorChave) {
            Assertions.assertEquals(pixFound.tipoDeChave.name, tipoDeChave)
            Assertions.assertEquals(pixFound.chave, chave)
            Assertions.assertEquals(pixFound.conta.nome, conta.titular)
            Assertions.assertEquals(pixFound.conta.cpf, conta.cpf)
            Assertions.assertEquals(pixFound.conta.ispb, conta.instituicao)
            Assertions.assertEquals(pixFound.conta.agencia, conta.agencia)
            Assertions.assertEquals(pixFound.conta.numero, conta.numeroConta)
            Assertions.assertEquals(pixFound.tipoDeConta.name, conta.tipo)
        }
    }

    @Test
    fun `deve buscar chave no servico do BCB e nao localmente`() {

        val pixResponse = pixKeyDetailsResponse()

        Mockito.`when`(bcbClient.buscaPorChave("chaveoutrobanco@gmail.com"))
                .thenReturn(
                        HttpResponse.ok(pixResponse)
                )

        val buscaPorChave = grpcClient.buscaPorChave(
                BuscaPorChavePixRequest.newBuilder()
                        .setChave("chaveoutrobanco@gmail.com")
                        .build()
        )

        with(buscaPorChave) {
            Assertions.assertEquals(pixResponse.keyType.name, tipoDeChave)
            Assertions.assertEquals(pixResponse.key, chave)
            Assertions.assertEquals(pixResponse.owner.name, conta.titular)
            Assertions.assertEquals(pixResponse.owner.taxIdNumber, conta.cpf)
            Assertions.assertEquals(pixResponse.bankAccount.participant, conta.instituicao)
            Assertions.assertEquals(pixResponse.bankAccount.branch, conta.agencia)
            Assertions.assertEquals(pixResponse.bankAccount.accountNumber, conta.numeroConta)
        }

    }

    @Test
    fun `deve lancar excecao ao buscar chave inexistente localmente ou no BCB`() {
        
        Mockito.`when`(bcbClient.buscaPorChave("chavenaoexistente@gmail.com"))
                .thenReturn(HttpResponse.badRequest())

        val assertThrow = assertThrows<StatusRuntimeException> {
            grpcClient.buscaPorChave(BuscaPorChavePixRequest.newBuilder()
                    .setChave("chavenaoexistente@gmail.com")
                    .build())
        }

        with(assertThrow){
            Assertions.assertEquals(Status.NOT_FOUND.code, status.code)
            Assertions.assertEquals("Chave não encontrada", status.description)
        }
    }

    @MockBean(BancoCentralClient::class)
    fun bcbClient(): BancoCentralClient {
        return Mockito.mock(BancoCentralClient::class.java)
    }

    @Factory
    class Client {
        @Bean
        fun client(@GrpcChannel(GrpcServerChannel.NAME) channel: ManagedChannel):
                KeyManagerBuscaChaveGrpcServiceGrpc.KeyManagerBuscaChaveGrpcServiceBlockingStub {

            return KeyManagerBuscaChaveGrpcServiceGrpc.newBlockingStub(channel)
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

    private fun pixKeyDetailsResponse(): PixKeyDetailsResponse {
        return PixKeyDetailsResponse(
                keyType = KeyType.EMAIL,
                key = "chaveoutrobanco@gmail.com",
                bankAccount = BankAccount(
                        participant = "60701190",
                        branch = "0001",
                        accountNumber = "291900",
                        accountType = AccountType.CACC
                ),
                owner = Owner(
                        type = Owner.OwnerType.NATURAL_PERSON,
                        name = "Marcelo Felix",
                        taxIdNumber = "02467781054"
                ),
                createdAt = LocalDateTime.now()
        )
    }
}