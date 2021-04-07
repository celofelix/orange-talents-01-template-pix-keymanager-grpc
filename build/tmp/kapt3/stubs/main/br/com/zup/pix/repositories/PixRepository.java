package br.com.zup.pix.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H&J\'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH&\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lbr/com/zup/pix/repositories/PixRepository;", "Lio/micronaut/data/jpa/repository/JpaRepository;", "Lbr/com/zup/pix/itau/Pix;", "", "existsByChave", "", "chave", "", "findAllByClienteId", "", "clienteId", "Ljava/util/UUID;", "findByChave", "Ljava/util/Optional;", "findByIdAndClienteId", "idPix", "idCliente", "(Ljava/lang/Long;Ljava/util/UUID;)Ljava/util/Optional;", "key-manager-grpc"})
@io.micronaut.data.annotation.Repository
public abstract interface PixRepository extends io.micronaut.data.jpa.repository.JpaRepository<br.com.zup.pix.itau.Pix, java.lang.Long> {
    
    public abstract boolean existsByChave(@org.jetbrains.annotations.NotNull
    java.lang.String chave);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Optional<br.com.zup.pix.itau.Pix> findByIdAndClienteId(@org.jetbrains.annotations.Nullable
    java.lang.Long idPix, @org.jetbrains.annotations.Nullable
    java.util.UUID idCliente);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Optional<br.com.zup.pix.itau.Pix> findByChave(@org.jetbrains.annotations.NotNull
    java.lang.String chave);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<br.com.zup.pix.itau.Pix> findAllByClienteId(@org.jetbrains.annotations.NotNull
    java.util.UUID clienteId);
}