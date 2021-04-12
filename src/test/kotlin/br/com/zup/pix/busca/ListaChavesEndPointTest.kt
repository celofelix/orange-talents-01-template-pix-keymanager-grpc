package br.com.zup.pix.busca

import br.com.zup.KeyManagerListaChavesGrpcServiceGrpc
import br.com.zup.ListaChavesPixRequest
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
class ListaChavesEndPointTest(
        val repository: PixRepository,
        val grpcClient: KeyManagerListaChavesGrpcServiceGrpc.KeyManagerListaChavesGrpcServiceBlockingStub
) {

    companion object {
        val CLIENTE_ID: UUID = UUID.randomUUID()
    }

    private lateinit var pix1 : Pix
    private lateinit var pix2 : Pix

    @BeforeEach
    fun set() {
        pix1 = repository.save(chave(tipoChave = TipoChave.EMAIL, chave = "marcelo@gmail.com"))
        pix2 = repository.save(chave(tipoChave = TipoChave.ALEATORIA, chave = UUID.randomUUID().toString()))
    }

    @Test
    fun `deve listar todas as chaves existente do cliente`() {

        val clienteId = CLIENTE_ID.toString()

        /* Executando requisição para o endpoint gRPC responsável por listar as chaves
        Enviando a mesma chave salva nos objetos pix salvos anteriormente
        A resposta irá ser uma lista com 2 objetos dentro */
        val listaChaves = grpcClient.listaChaves(ListaChavesPixRequest.newBuilder()
                .setClienteId(clienteId)
                .build())

        /* No primeiro assert Validando o tamanho da lista recebida na resposta
        No segundo assert está sendo verificado o ID do cliente
        No terceiro assert pegando o primeiro objeto no indice 0 da lista e validando a chave
        No quarto assert pegando o primeiro objeto no indice 0 da lista e validando o tipo de chave */
        with(listaChaves) {
            Assertions.assertEquals(2, this.chavesCount)
            Assertions.assertEquals(pix1.clienteId.toString(), getClienteId())
            Assertions.assertEquals(pix1.chave, getChaves(0).chave)
            Assertions.assertEquals(pix1.tipoDeChave.name, getChaves(0).tipoChave)
        }

        /* No primeiro assert Validando o tamanho da lista recebida na resposta,
        No segundo assert está sendo verificado o ID do cliente
        No terceiro assert pegando o segundo objeto no indice 1 da lista e validando a chave
        No quarto assert pegando o segundo objeto no indice 1 da lista e validando o tipo de chave */
        with(listaChaves) {
            Assertions.assertEquals(2, chavesCount)
            Assertions.assertEquals(pix2.clienteId.toString(), getClienteId())
            Assertions.assertEquals(pix2.chave, getChaves(1).chave)
            Assertions.assertEquals(pix2.tipoDeChave.name, getChaves(1).tipoChave)
        }
    }


    @Factory
    class Client {
        @Bean
        fun client(@GrpcChannel(GrpcServerChannel.NAME) channel: ManagedChannel): KeyManagerListaChavesGrpcServiceGrpc.KeyManagerListaChavesGrpcServiceBlockingStub {
            return KeyManagerListaChavesGrpcServiceGrpc.newBlockingStub(channel)
        }
    }

    private fun chave(tipoChave: TipoChave, chave: String): Pix {
        return Pix(
                clienteId = CLIENTE_ID,
                tipoDeChave = tipoChave,
                chave = chave,
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