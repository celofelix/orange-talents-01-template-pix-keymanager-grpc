package br.com.zup.pix.busca;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lbr/com/zup/pix/busca/BuscaPorIDService;", "", "pixRepository", "Lbr/com/zup/pix/repositories/PixRepository;", "(Lbr/com/zup/pix/repositories/PixRepository;)V", "getPixRepository", "()Lbr/com/zup/pix/repositories/PixRepository;", "busca", "Lbr/com/zup/pix/itau/Pix;", "pixId", "", "clienteId", "key-manager-grpc"})
@javax.inject.Singleton
@io.micronaut.validation.Validated
public class BuscaPorIDService {
    @org.jetbrains.annotations.NotNull
    @javax.inject.Inject
    private final br.com.zup.pix.repositories.PixRepository pixRepository = null;
    
    @org.jetbrains.annotations.NotNull
    @javax.transaction.Transactional
    public br.com.zup.pix.itau.Pix busca(@org.jetbrains.annotations.Nullable
    java.lang.String pixId, @org.jetbrains.annotations.Nullable
    java.lang.String clienteId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public br.com.zup.pix.repositories.PixRepository getPixRepository() {
        return null;
    }
    
    public BuscaPorIDService(@org.jetbrains.annotations.NotNull
    br.com.zup.pix.repositories.PixRepository pixRepository) {
        super();
    }
}