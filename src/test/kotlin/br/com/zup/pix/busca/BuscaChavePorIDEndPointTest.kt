package br.com.zup.pix.busca

import br.com.zup.BuscaChavePorIDPixRequest
import br.com.zup.KeyManagerBuscaChavePorIDGrpcServiceGrpc
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
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.*
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

    @AfterEach
    fun clean() {
        repository.deleteAll()
    }

    @Test
    fun `deve buscar chave existente atraves de clienteID e pixID busca local`() {

        val pix = repository.findByIdAndClienteId(chave.id, chave.clienteId).get()

        val response = grpcClient.buscaChavePorID(
            BuscaChavePorIDPixRequest.newBuilder()
                .setClienteId(chave.clienteId.toString())
                .setPixId(chave.id.toString())
                .build()
        )

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

    @Test
    fun `deve lancar excecao caso chave nao exista`() {

        /* Executando requisição para o endpoint com dados que não existentes
        Guardando a exceção lançada na variavel para verificação */
        val assertThrow = assertThrows<StatusRuntimeException> {
            grpcClient.buscaChavePorID(
                BuscaChavePorIDPixRequest.newBuilder()
                    .setPixId("3")
                    .setClienteId(UUID.randomUUID().toString())
                    .build()
            )
        }

        /* Validando o código da exceção lançada e também a mensagem da exceção
        Mapeamento da exceção está sendo feito pela classe ChaveNaoExistenteHandler */
        with(assertThrow) {
            Assertions.assertEquals(Status.NOT_FOUND.code, status.code)
            Assertions.assertEquals(
                "Chave Pix não existe ou não pertence ao cliente informado",
                status.description
            )
        }
    }

    @Test
    fun `nao deve buscar caso a chave caso os parametros sejam invalidos`() {

        /* Executando requisição para endpoint
        Será lançado uma exceção devidos aos parametros estarem vazios
        Guardando a exceção na variavel para validação */
        val assertThrow = assertThrows<StatusRuntimeException> {
            grpcClient.buscaChavePorID(
                BuscaChavePorIDPixRequest.newBuilder().build()
            )
        }

        /* Validando a exceção e descrição lançada da mesma
        Mapeamento do status e descriação foi deito na classe ConstraintViolationExceptionHandler */
        with(assertThrow) {
            Assertions.assertEquals(Status.INVALID_ARGUMENT.code, status.code)
            Assertions.assertEquals("Dados inválidos", status.description)
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