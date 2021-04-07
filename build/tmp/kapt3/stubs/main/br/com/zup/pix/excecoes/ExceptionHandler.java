package br.com.zup.pix.excecoes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u00032\u00020\u0004:\u0001\u000bJ\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H&\u00a8\u0006\f"}, d2 = {"Lbr/com/zup/pix/excecoes/ExceptionHandler;", "T", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "handle", "Lbr/com/zup/pix/excecoes/ExceptionHandler$StatusWrapper;", "e", "(Ljava/lang/Exception;)Lbr/com/zup/pix/excecoes/ExceptionHandler$StatusWrapper;", "supports", "", "StatusWrapper", "key-manager-grpc"})
public abstract interface ExceptionHandler<T extends java.lang.Exception> {
    
    @org.jetbrains.annotations.NotNull
    public abstract br.com.zup.pix.excecoes.ExceptionHandler.StatusWrapper handle(@org.jetbrains.annotations.NotNull
    T e);
    
    public abstract boolean supports(@org.jetbrains.annotations.NotNull
    java.lang.Exception e);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0017\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0003J\t\u0010\u0012\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u000bH\u00c6\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lbr/com/zup/pix/excecoes/ExceptionHandler$StatusWrapper;", "", "statusException", "Lio/grpc/StatusRuntimeException;", "(Lio/grpc/StatusRuntimeException;)V", "statusProto", "Lcom/google/rpc/Status;", "(Lcom/google/rpc/Status;)V", "status", "Lio/grpc/Status;", "metadata", "Lio/grpc/Metadata;", "(Lio/grpc/Status;Lio/grpc/Metadata;)V", "getMetadata", "()Lio/grpc/Metadata;", "getStatus", "()Lio/grpc/Status;", "asRuntimeException", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "key-manager-grpc"})
    public static final class StatusWrapper {
        @org.jetbrains.annotations.NotNull
        private final io.grpc.Status status = null;
        @org.jetbrains.annotations.NotNull
        private final io.grpc.Metadata metadata = null;
        
        @org.jetbrains.annotations.NotNull
        public final io.grpc.StatusRuntimeException asRuntimeException() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final io.grpc.Status getStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final io.grpc.Metadata getMetadata() {
            return null;
        }
        
        public StatusWrapper(@org.jetbrains.annotations.NotNull
        io.grpc.Status status, @org.jetbrains.annotations.NotNull
        io.grpc.Metadata metadata) {
            super();
        }
        
        public StatusWrapper(@org.jetbrains.annotations.NotNull
        io.grpc.StatusRuntimeException statusException) {
            super();
        }
        
        public StatusWrapper(@org.jetbrains.annotations.NotNull
        com.google.rpc.Status statusProto) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final io.grpc.Status component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final io.grpc.Metadata component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final br.com.zup.pix.excecoes.ExceptionHandler.StatusWrapper copy(@org.jetbrains.annotations.NotNull
        io.grpc.Status status, @org.jetbrains.annotations.NotNull
        io.grpc.Metadata metadata) {
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
}