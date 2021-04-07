package br.com.zup.pix.itau;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/pix/itau/TipoChave;", "", "(Ljava/lang/String;I)V", "valida", "", "chave", "", "CPF", "CELULAR", "EMAIL", "ALEATORIA", "key-manager-grpc"})
public enum TipoChave {
    /*public static final*/ CPF /* = new @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/pix/itau/TipoChave$CPF;", "Lbr/com/zup/pix/itau/TipoChave;", "valida", "", "chave", "", "key-manager-grpc"}) CPF(){
    
    @java.lang.Override
    public boolean valida(@org.jetbrains.annotations.Nullable
    java.lang.String chave) {
        return false;
    }
    
    CPF() {
        super();
    }
} */,
    /*public static final*/ CELULAR /* = new @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/pix/itau/TipoChave$CELULAR;", "Lbr/com/zup/pix/itau/TipoChave;", "valida", "", "chave", "", "key-manager-grpc"}) CELULAR(){
    
    @java.lang.Override
    public boolean valida(@org.jetbrains.annotations.Nullable
    java.lang.String chave) {
        return false;
    }
    
    CELULAR() {
        super();
    }
} */,
    /*public static final*/ EMAIL /* = new @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/pix/itau/TipoChave$EMAIL;", "Lbr/com/zup/pix/itau/TipoChave;", "valida", "", "chave", "", "key-manager-grpc"}) EMAIL(){
    
    @java.lang.Override
    public boolean valida(@org.jetbrains.annotations.Nullable
    java.lang.String chave) {
        return false;
    }
    
    EMAIL() {
        super();
    }
} */,
    /*public static final*/ ALEATORIA /* = new @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/pix/itau/TipoChave$ALEATORIA;", "Lbr/com/zup/pix/itau/TipoChave;", "valida", "", "chave", "", "key-manager-grpc"}) ALEATORIA(){
    
    @java.lang.Override
    public boolean valida(@org.jetbrains.annotations.Nullable
    java.lang.String chave) {
        return false;
    }
    
    ALEATORIA() {
        super();
    }
} */;
    
    public abstract boolean valida(@org.jetbrains.annotations.Nullable
    java.lang.String chave);
    
    TipoChave() {
    }
}