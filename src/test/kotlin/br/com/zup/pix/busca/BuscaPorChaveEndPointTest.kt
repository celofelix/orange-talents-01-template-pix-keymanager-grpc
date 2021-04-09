package br.com.zup.pix.busca

import br.com.zup.BuscaPorChavePixRequest
import br.com.zup.KeyManagerBuscaChaveGrpcServiceGrpc
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
import io.micronaut.test.annotation.MockBean
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import java.util.*
import javax.inject.Inject

@MicronautTest(transactional = false)
class BuscaPorChaveEndPointTest(
    val repository: PixRepository,
    val grpcClient: KeyManagerBuscaChaveGrpcServiceGrpc.KeyManagerBuscaChaveGrpcServiceBlockingStub

) {

    companion object {
        val CLIENTE_ID: UUID = UUID.randomUUID()
    }

    private lateinit var pix: Pix

    @BeforeEach
    fun save() {
        pix = repository.save(chave())
    }

    @AfterEach
    fun clean() {
        repository.deleteAll()
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
}