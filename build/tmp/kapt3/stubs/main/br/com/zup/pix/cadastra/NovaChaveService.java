package br.com.zup.pix.cadastra;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0017R\u0016\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lbr/com/zup/pix/cadastra/NovaChaveService;", "", "contasItauClient", "Lbr/com/zup/pix/clients/ContasClientesItauClient;", "chaveRepository", "Lbr/com/zup/pix/repositories/PixRepository;", "bcbClient", "Lbr/com/zup/pix/clients/BancoCentralClient;", "(Lbr/com/zup/pix/clients/ContasClientesItauClient;Lbr/com/zup/pix/repositories/PixRepository;Lbr/com/zup/pix/clients/BancoCentralClient;)V", "getBcbClient", "()Lbr/com/zup/pix/clients/BancoCentralClient;", "getChaveRepository", "()Lbr/com/zup/pix/repositories/PixRepository;", "getContasItauClient", "()Lbr/com/zup/pix/clients/ContasClientesItauClient;", "registra", "Lbr/com/zup/pix/itau/Pix;", "novaChave", "Lbr/com/zup/pix/itau/NovaChave;", "key-manager-grpc"})
@javax.inject.Singleton
@io.micronaut.validation.Validated
public class NovaChaveService {
    @org.jetbrains.annotations.NotNull
    @javax.inject.Inject
    private final br.com.zup.pix.clients.ContasClientesItauClient contasItauClient = null;
    @org.jetbrains.annotations.NotNull
    @javax.inject.Inject
    private final br.com.zup.pix.repositories.PixRepository chaveRepository = null;
    @org.jetbrains.annotations.NotNull
    @javax.inject.Inject
    private final br.com.zup.pix.clients.BancoCentralClient bcbClient = null;
    
    @org.jetbrains.annotations.NotNull
    @javax.transaction.Transactional
    public br.com.zup.pix.itau.Pix registra(@org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    br.com.zup.pix.itau.NovaChave novaChave) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public br.com.zup.pix.clients.ContasClientesItauClient getContasItauClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public br.com.zup.pix.repositories.PixRepository getChaveRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public br.com.zup.pix.clients.BancoCentralClient getBcbClient() {
        return null;
    }
    
    public NovaChaveService(@org.jetbrains.annotations.NotNull
    br.com.zup.pix.clients.ContasClientesItauClient contasItauClient, @org.jetbrains.annotations.NotNull
    br.com.zup.pix.repositories.PixRepository chaveRepository, @org.jetbrains.annotations.NotNull
    br.com.zup.pix.clients.BancoCentralClient bcbClient) {
        super();
    }
}