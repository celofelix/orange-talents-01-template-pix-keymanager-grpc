package br.com.zup.pix.clients

import br.com.zup.pix.itau.ContaResponse
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.client.annotation.Client
import javax.inject.Singleton

@Singleton
@Client(value = "\${itau.url}")
interface ContasClientesItauClient {

    @Get("/api/v1/clientes/{clientId}/contas{?tipo}")
    fun buscaConta(@PathVariable clientId: String, @QueryValue tipo: String): HttpResponse<ContaResponse>

}