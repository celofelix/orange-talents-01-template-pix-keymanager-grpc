package br.com.zup.pix.clients;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\'\u00a8\u0006\u0010"}, d2 = {"Lbr/com/zup/pix/clients/BancoCentralClient;", "", "buscaPorChave", "Lio/micronaut/http/HttpResponse;", "Lbr/com/zup/pix/bcb/PixKeyDetailsResponse;", "key", "", "cadastra", "Lbr/com/zup/pix/bcb/CreatePixKeyResponse;", "reqest", "Lbr/com/zup/pix/bcb/CreatePixKeyRequest;", "deleta", "Lbr/com/zup/pix/bcb/DeletePixKeyResponse;", "chave", "request", "Lbr/com/zup/pix/bcb/DeletePixKeyRequest;", "key-manager-grpc"})
@io.micronaut.http.client.annotation.Client(value = "${bcb.url}")
public abstract interface BancoCentralClient {
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Post(value = "/api/v1/pix/keys", produces = {"application/xml"}, consumes = {"application/xml"})
    public abstract io.micronaut.http.HttpResponse<br.com.zup.pix.bcb.CreatePixKeyResponse> cadastra(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Body
    br.com.zup.pix.bcb.CreatePixKeyRequest reqest);
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Delete(value = "/api/v1/pix/keys/{key}", produces = {"application/xml"}, consumes = {"application/xml"})
    public abstract io.micronaut.http.HttpResponse<br.com.zup.pix.bcb.DeletePixKeyResponse> deleta(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.PathVariable
    java.lang.String chave, @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Body
    br.com.zup.pix.bcb.DeletePixKeyRequest request);
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/api/v1/pix/keys/{key}", consumes = {"application/xml"})
    public abstract io.micronaut.http.HttpResponse<br.com.zup.pix.bcb.PixKeyDetailsResponse> buscaPorChave(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.PathVariable
    java.lang.String key);
}