package br.com.zup.pix.exclui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0014H\u0007J\b\u0010\u0016\u001a\u00020\u0014H\u0007J\b\u0010\u0017\u001a\u00020\u0014H\u0007J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0007R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lbr/com/zup/pix/exclui/ExcluiPixEndPointTest;", "", "pixRepository", "Lbr/com/zup/pix/repositories/PixRepository;", "grpcClient", "Lbr/com/zup/KeyManagerExcluiGrpcServiceGrpc$KeyManagerExcluiGrpcServiceBlockingStub;", "(Lbr/com/zup/pix/repositories/PixRepository;Lbr/com/zup/KeyManagerExcluiGrpcServiceGrpc$KeyManagerExcluiGrpcServiceBlockingStub;)V", "bcbClient", "Lbr/com/zup/pix/clients/BancoCentralClient;", "getBcbClient", "()Lbr/com/zup/pix/clients/BancoCentralClient;", "setBcbClient", "(Lbr/com/zup/pix/clients/BancoCentralClient;)V", "chave", "Lbr/com/zup/pix/itau/Pix;", "getGrpcClient", "()Lbr/com/zup/KeyManagerExcluiGrpcServiceGrpc$KeyManagerExcluiGrpcServiceBlockingStub;", "getPixRepository", "()Lbr/com/zup/pix/repositories/PixRepository;", "delete", "", "deve excluir uma chave existente", "nao deve excluir se a chave nao existir ou nao pertencer ao cliente", "nao deve remover chave pix se ocorrer erro no servico bcb", "pix", "set", "Client", "Companion", "key-manager-grpc"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest(transactional = false)
public final class ExcluiPixEndPointTest {
    @org.jetbrains.annotations.NotNull
    @javax.inject.Inject
    public br.com.zup.pix.clients.BancoCentralClient bcbClient;
    private br.com.zup.pix.itau.Pix chave;
    @org.jetbrains.annotations.NotNull
    private final br.com.zup.pix.repositories.PixRepository pixRepository = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.zup.KeyManagerExcluiGrpcServiceGrpc.KeyManagerExcluiGrpcServiceBlockingStub grpcClient = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.UUID CLIENTE_ID = null;
    public static final br.com.zup.pix.exclui.ExcluiPixEndPointTest.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.clients.BancoCentralClient getBcbClient() {
        return null;
    }
    
    public final void setBcbClient(@org.jetbrains.annotations.NotNull
    br.com.zup.pix.clients.BancoCentralClient p0) {
    }
    
    @org.junit.jupiter.api.BeforeEach
    public final void set() {
    }
    
    @org.junit.jupiter.api.AfterEach
    public final void delete() {
    }
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.test.annotation.MockBean(value = br.com.zup.pix.clients.BancoCentralClient.class)
    public final br.com.zup.pix.clients.BancoCentralClient bcbClient() {
        return null;
    }
    
    private final br.com.zup.pix.itau.Pix pix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.repositories.PixRepository getPixRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.KeyManagerExcluiGrpcServiceGrpc.KeyManagerExcluiGrpcServiceBlockingStub getGrpcClient() {
        return null;
    }
    
    public ExcluiPixEndPointTest(@org.jetbrains.annotations.NotNull
    br.com.zup.pix.repositories.PixRepository pixRepository, @org.jetbrains.annotations.NotNull
    br.com.zup.KeyManagerExcluiGrpcServiceGrpc.KeyManagerExcluiGrpcServiceBlockingStub grpcClient) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lbr/com/zup/pix/exclui/ExcluiPixEndPointTest$Client;", "", "()V", "set", "Lbr/com/zup/KeyManagerExcluiGrpcServiceGrpc$KeyManagerExcluiGrpcServiceBlockingStub;", "channel", "Lio/grpc/ManagedChannel;", "key-manager-grpc"})
    @io.micronaut.context.annotation.Factory
    public static final class Client {
        
        @org.jetbrains.annotations.NotNull
        @io.micronaut.context.annotation.Bean
        public final br.com.zup.KeyManagerExcluiGrpcServiceGrpc.KeyManagerExcluiGrpcServiceBlockingStub set(@org.jetbrains.annotations.NotNull
        @io.micronaut.grpc.annotation.GrpcChannel(value = "grpc-server")
        io.grpc.ManagedChannel channel) {
            return null;
        }
        
        public Client() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lbr/com/zup/pix/exclui/ExcluiPixEndPointTest$Companion;", "", "()V", "CLIENTE_ID", "Ljava/util/UUID;", "getCLIENTE_ID", "()Ljava/util/UUID;", "key-manager-grpc"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull
        public final java.util.UUID getCLIENTE_ID() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}