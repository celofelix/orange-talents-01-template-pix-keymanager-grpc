package br.com.zup.pix.busca;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007J\b\u0010\u0010\u001a\u00020\u000eH\u0007J\b\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0007R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lbr/com/zup/pix/busca/BuscaChavePorIDEndPointTest;", "", "repository", "Lbr/com/zup/pix/repositories/PixRepository;", "grpcClient", "Lbr/com/zup/KeyManagerBuscaChavePorIDGrpcServiceGrpc$KeyManagerBuscaChavePorIDGrpcServiceBlockingStub;", "(Lbr/com/zup/pix/repositories/PixRepository;Lbr/com/zup/KeyManagerBuscaChavePorIDGrpcServiceGrpc$KeyManagerBuscaChavePorIDGrpcServiceBlockingStub;)V", "chave", "Lbr/com/zup/pix/itau/Pix;", "getGrpcClient", "()Lbr/com/zup/KeyManagerBuscaChavePorIDGrpcServiceGrpc$KeyManagerBuscaChavePorIDGrpcServiceBlockingStub;", "getRepository", "()Lbr/com/zup/pix/repositories/PixRepository;", "clean", "", "deve buscar chave existente atraves de clienteID e pixID busca local", "deve lancar excecao caso chave nao exista", "pix", "set", "Client", "Companion", "key-manager-grpc"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest(transactional = false)
public final class BuscaChavePorIDEndPointTest {
    private br.com.zup.pix.itau.Pix chave;
    @org.jetbrains.annotations.NotNull
    private final br.com.zup.pix.repositories.PixRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.zup.KeyManagerBuscaChavePorIDGrpcServiceGrpc.KeyManagerBuscaChavePorIDGrpcServiceBlockingStub grpcClient = null;
    private static final java.util.UUID CLIENTE_ID = null;
    public static final br.com.zup.pix.busca.BuscaChavePorIDEndPointTest.Companion Companion = null;
    
    @org.junit.jupiter.api.BeforeEach
    public final void set() {
    }
    
    @org.junit.jupiter.api.AfterEach
    public final void clean() {
    }
    
    private final br.com.zup.pix.itau.Pix pix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.repositories.PixRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.KeyManagerBuscaChavePorIDGrpcServiceGrpc.KeyManagerBuscaChavePorIDGrpcServiceBlockingStub getGrpcClient() {
        return null;
    }
    
    public BuscaChavePorIDEndPointTest(@org.jetbrains.annotations.NotNull
    br.com.zup.pix.repositories.PixRepository repository, @org.jetbrains.annotations.NotNull
    br.com.zup.KeyManagerBuscaChavePorIDGrpcServiceGrpc.KeyManagerBuscaChavePorIDGrpcServiceBlockingStub grpcClient) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lbr/com/zup/pix/busca/BuscaChavePorIDEndPointTest$Client;", "", "()V", "client", "Lbr/com/zup/KeyManagerBuscaChavePorIDGrpcServiceGrpc$KeyManagerBuscaChavePorIDGrpcServiceBlockingStub;", "channel", "Lio/grpc/ManagedChannel;", "key-manager-grpc"})
    @io.micronaut.context.annotation.Factory
    public static final class Client {
        
        @org.jetbrains.annotations.NotNull
        @io.micronaut.context.annotation.Bean
        public final br.com.zup.KeyManagerBuscaChavePorIDGrpcServiceGrpc.KeyManagerBuscaChavePorIDGrpcServiceBlockingStub client(@org.jetbrains.annotations.NotNull
        @io.micronaut.grpc.annotation.GrpcChannel(value = "grpc-server")
        io.grpc.ManagedChannel channel) {
            return null;
        }
        
        public Client() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lbr/com/zup/pix/busca/BuscaChavePorIDEndPointTest$Companion;", "", "()V", "CLIENTE_ID", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "getCLIENTE_ID", "()Ljava/util/UUID;", "key-manager-grpc"})
    public static final class Companion {
        
        public final java.util.UUID getCLIENTE_ID() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}