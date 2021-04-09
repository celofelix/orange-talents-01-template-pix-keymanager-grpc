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

        /* Simulando o corportamento de exclusão do serviço BCB
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

        /* Executando a requisção no endpoint para exclusão da chave */
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

    @Test
    fun `nao deve remover chave pix se ocorrer erro no servico bcb`() {

        /* Simulando o comportamento de exclusão do serviço do BCB
        Retornando uma exceção para simular uma chave não existente no BCB */
        Mockito.`when`(
            bcbClient.deleta(
                chave = "marcelo@gmail.com",
                DeletePixKeyRequest(key = "marcelo@gmail.com", participant = "60701190")
            )
        ).thenReturn(HttpResponse.unprocessableEntity())

        /* Executando a requisição no endpoint para exclusão
        Usando o assertThrows para receber o retorno do da exceção
        Deve ser usado o StatusRuntimeException, essa é a exceção lançada pelo grpc */
        val assertThrow = assertThrows<StatusRuntimeException> {
            grpcClient.exclui(
                ExcluiChavePixRequest.newBuilder()
                    .setPixId(chave.id.toString())
                    .setClienteId(chave.clienteId.toString())
                    .build()
            )
        }

        /* Validando o status da exceção lançada no endpoint
        O status code está mapeado na classe ChaveNaoExistenteHandler */
        with(assertThrow) {
            Assertions.assertEquals(Status.NOT_FOUND.code, status.code)
            Assertions.assertEquals(
                "Não foi possível deletar a sua chave pix no Banco Central",
                status.description
            )
        }
    }

    @Test
    fun `nao deve excluir se a chave nao existir ou nao pertencer ao cliente`() {

        /* Criando um ID diferentedo que foi salvo anteriormente no repository */
        val clienteInvalidoID = UUID.randomUUID().toString()

        /* Executando a requisição ao endpoint e guardando a exceção lançada*/
        val assertThrow = assertThrows<StatusRuntimeException> {
            grpcClient.exclui(
                ExcluiChavePixRequest.newBuilder()
                    .setPixId(chave.id.toString())
                    .setClienteId(clienteInvalidoID)
                    .build()
            )
        }

        /* Validando o status da exceção lançada no endpoint
        O status code está mapeado na classe ChaveNaoExistenteHandler */
        with(assertThrow) {
            Assertions.assertEquals(Status.NOT_FOUND.code, status.code)
            Assertions.assertEquals(
                "Chave Pix informada não existe ou não pertence ao cliente informado",
                status.description
            )
        }
    }

    @Test
    fun `nao deve excluir com parametros da requisicao invalidos`() {

        /* Enviando uma requisição com os parâmetros vázios
        Será lançado uma exceção e está sendo guardada na variável para validação */
        val assertThrow = assertThrows<StatusRuntimeException> {
            grpcClient.exclui(ExcluiChavePixRequest.newBuilder().build())
        }

        /* Validando a exceção lançada pelo gRPC. Deve ser exceção INVALID_ARGUMENT
        A exceção é capturada pela ConstraintViolationExceptionHandler */
        with(assertThrow) {
            Assertions.assertEquals(Status.INVALID_ARGUMENT.code, status.code)
            Assertions.assertEquals("Dados inválidos", status.description)
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