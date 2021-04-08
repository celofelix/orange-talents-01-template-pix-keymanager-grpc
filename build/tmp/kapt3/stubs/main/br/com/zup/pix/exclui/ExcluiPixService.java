package br.com.zup.pix.exclui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lbr/com/zup/pix/exclui/ExcluiPixService;", "", "pixRepository", "Lbr/com/zup/pix/repositories/PixRepository;", "bcbClient", "Lbr/com/zup/pix/clients/BancoCentralClient;", "(Lbr/com/zup/pix/repositories/PixRepository;Lbr/com/zup/pix/clients/BancoCentralClient;)V", "getBcbClient", "()Lbr/com/zup/pix/clients/BancoCentralClient;", "getPixRepository", "()Lbr/com/zup/pix/repositories/PixRepository;", "remove", "", "pixId", "", "clienteId", "key-manager-grpc"})
@javax.inject.Singleton
@io.micronaut.validation.Validated
public class ExcluiPixService {
    @org.jetbrains.annotations.NotNull
    @javax.inject.Inject
    private final br.com.zup.pix.repositories.PixRepository pixRepository = null;
    @org.jetbrains.annotations.NotNull
    @javax.inject.Inject
    private final br.com.zup.pix.clients.BancoCentralClient bcbClient = null;
    
    @javax.transaction.Transactional
    public void remove(@org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.NotBlank
    java.lang.String pixId, @org.jetbrains.annotations.Nullable
    @br.com.zup.pix.validacoes.ValidUUID(message = "ID do cliente est\u00e1 em formato inv\u00e1lido e preenchido")
    @javax.validation.constraints.NotBlank
    java.lang.String clienteId) {
    }
    
    @org.jetbrains.annotations.NotNull
    public br.com.zup.pix.repositories.PixRepository getPixRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public br.com.zup.pix.clients.BancoCentralClient getBcbClient() {
        return null;
    }
    
    public ExcluiPixService(@org.jetbrains.annotations.NotNull
    br.com.zup.pix.repositories.PixRepository pixRepository, @org.jetbrains.annotations.NotNull
    br.com.zup.pix.clients.BancoCentralClient bcbClient) {
        super();
    }
}