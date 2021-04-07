package br.com.zup.pix.itau;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00c6\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006 "}, d2 = {"Lbr/com/zup/pix/itau/NovaChave;", "", "clienteId", "", "tipoDeChave", "Lbr/com/zup/pix/itau/TipoChave;", "chave", "tipoDeConta", "Lbr/com/zup/pix/itau/TipoConta;", "(Ljava/lang/String;Lbr/com/zup/pix/itau/TipoChave;Ljava/lang/String;Lbr/com/zup/pix/itau/TipoConta;)V", "getChave", "()Ljava/lang/String;", "getClienteId", "getTipoDeChave", "()Lbr/com/zup/pix/itau/TipoChave;", "getTipoDeConta", "()Lbr/com/zup/pix/itau/TipoConta;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toModel", "Lbr/com/zup/pix/itau/Pix;", "conta", "Lbr/com/zup/pix/itau/Conta;", "toString", "key-manager-grpc"})
@io.micronaut.core.annotation.Introspected
@br.com.zup.pix.validacoes.ValidChave
public final class NovaChave {
    @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.NotBlank
    private final java.lang.String clienteId = null;
    @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.NotNull
    private final br.com.zup.pix.itau.TipoChave tipoDeChave = null;
    @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.Size(max = 77)
    private final java.lang.String chave = null;
    @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.NotNull
    private final br.com.zup.pix.itau.TipoConta tipoDeConta = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.itau.Pix toModel(@org.jetbrains.annotations.NotNull
    br.com.zup.pix.itau.Conta conta) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getClienteId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.zup.pix.itau.TipoChave getTipoDeChave() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getChave() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.zup.pix.itau.TipoConta getTipoDeConta() {
        return null;
    }
    
    public NovaChave(@org.jetbrains.annotations.Nullable
    @br.com.zup.pix.validacoes.ValidUUID
    java.lang.String clienteId, @org.jetbrains.annotations.Nullable
    br.com.zup.pix.itau.TipoChave tipoDeChave, @org.jetbrains.annotations.Nullable
    java.lang.String chave, @org.jetbrains.annotations.Nullable
    br.com.zup.pix.itau.TipoConta tipoDeConta) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.zup.pix.itau.TipoChave component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.zup.pix.itau.TipoConta component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.itau.NovaChave copy(@org.jetbrains.annotations.Nullable
    @br.com.zup.pix.validacoes.ValidUUID
    java.lang.String clienteId, @org.jetbrains.annotations.Nullable
    br.com.zup.pix.itau.TipoChave tipoDeChave, @org.jetbrains.annotations.Nullable
    java.lang.String chave, @org.jetbrains.annotations.Nullable
    br.com.zup.pix.itau.TipoConta tipoDeConta) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object p0) {
        return false;
    }
}