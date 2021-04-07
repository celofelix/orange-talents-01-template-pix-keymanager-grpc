package br.com.zup.pix.itau;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#\u00a8\u0006\'"}, d2 = {"Lbr/com/zup/pix/itau/Pix;", "", "clienteId", "Ljava/util/UUID;", "tipoDeChave", "Lbr/com/zup/pix/itau/TipoChave;", "chave", "", "tipoDeConta", "Lbr/com/zup/pix/itau/TipoConta;", "conta", "Lbr/com/zup/pix/itau/Conta;", "criadaEm", "Ljava/time/LocalDateTime;", "(Ljava/util/UUID;Lbr/com/zup/pix/itau/TipoChave;Ljava/lang/String;Lbr/com/zup/pix/itau/TipoConta;Lbr/com/zup/pix/itau/Conta;Ljava/time/LocalDateTime;)V", "getChave", "()Ljava/lang/String;", "setChave", "(Ljava/lang/String;)V", "getClienteId", "()Ljava/util/UUID;", "getConta", "()Lbr/com/zup/pix/itau/Conta;", "getCriadaEm", "()Ljava/time/LocalDateTime;", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTipoDeChave", "()Lbr/com/zup/pix/itau/TipoChave;", "getTipoDeConta", "()Lbr/com/zup/pix/itau/TipoConta;", "atualiza", "", "key", "key-manager-grpc"})
@javax.persistence.Table(uniqueConstraints = {@javax.persistence.UniqueConstraint(name = "chave_pix_uk", columnNames = {"chave"})})
@javax.persistence.Entity
public final class Pix {
    @org.jetbrains.annotations.Nullable
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable
    @org.hibernate.annotations.Type(type = "org.hibernate.type.UUIDCharType")
    @javax.persistence.Column(nullable = false)
    private final java.util.UUID clienteId = null;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(nullable = false)
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private final br.com.zup.pix.itau.TipoChave tipoDeChave = null;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(unique = true, nullable = false)
    private java.lang.String chave;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    @javax.persistence.Column(nullable = false)
    private final br.com.zup.pix.itau.TipoConta tipoDeConta = null;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Embedded
    private final br.com.zup.pix.itau.Conta conta = null;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime criadaEm = null;
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    public final void atualiza(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.UUID getClienteId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.itau.TipoChave getTipoDeChave() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getChave() {
        return null;
    }
    
    public final void setChave(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.itau.TipoConta getTipoDeConta() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.itau.Conta getConta() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDateTime getCriadaEm() {
        return null;
    }
    
    public Pix(@org.jetbrains.annotations.Nullable
    java.util.UUID clienteId, @org.jetbrains.annotations.NotNull
    br.com.zup.pix.itau.TipoChave tipoDeChave, @org.jetbrains.annotations.NotNull
    java.lang.String chave, @org.jetbrains.annotations.NotNull
    br.com.zup.pix.itau.TipoConta tipoDeConta, @org.jetbrains.annotations.NotNull
    br.com.zup.pix.itau.Conta conta, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime criadaEm) {
        super();
    }
}