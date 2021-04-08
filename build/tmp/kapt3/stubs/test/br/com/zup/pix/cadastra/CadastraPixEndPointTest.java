package br.com.zup.pix.cadastra;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002()B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\"H\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010#\u001a\u00020\"H\u0007J\b\u0010$\u001a\u00020\"H\u0007J\b\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020\"H\u0007R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006*"}, d2 = {"Lbr/com/zup/pix/cadastra/CadastraPixEndPointTest;", "", "repository", "Lbr/com/zup/pix/repositories/PixRepository;", "grpcCliente", "Lbr/com/zup/KeyManagerCadastraGrpcServiceGrpc$KeyManagerCadastraGrpcServiceBlockingStub;", "(Lbr/com/zup/pix/repositories/PixRepository;Lbr/com/zup/KeyManagerCadastraGrpcServiceGrpc$KeyManagerCadastraGrpcServiceBlockingStub;)V", "bcbClient", "Lbr/com/zup/pix/clients/BancoCentralClient;", "getBcbClient", "()Lbr/com/zup/pix/clients/BancoCentralClient;", "setBcbClient", "(Lbr/com/zup/pix/clients/BancoCentralClient;)V", "getGrpcCliente", "()Lbr/com/zup/KeyManagerCadastraGrpcServiceGrpc$KeyManagerCadastraGrpcServiceBlockingStub;", "itauClient", "Lbr/com/zup/pix/clients/ContasClientesItauClient;", "getItauClient", "()Lbr/com/zup/pix/clients/ContasClientesItauClient;", "setItauClient", "(Lbr/com/zup/pix/clients/ContasClientesItauClient;)V", "getRepository", "()Lbr/com/zup/pix/repositories/PixRepository;", "bankAccount", "Lbr/com/zup/pix/bcb/BankAccount;", "chave", "Lbr/com/zup/pix/itau/Pix;", "chavePixKeyRequest", "Lbr/com/zup/pix/bcb/CreatePixKeyRequest;", "chavePixKeyResponse", "Lbr/com/zup/pix/bcb/CreatePixKeyResponse;", "dadosDaContaResponse", "Lbr/com/zup/pix/itau/ContaResponse;", "deve cadastrar nova chave pix", "", "nao deve cadastrar pix se os dados bancarios nao existirem", "nao deve salvar chave pix ja existente", "owner", "Lbr/com/zup/pix/bcb/Owner;", "set", "ClientGrpc", "Companion", "key-manager-grpc"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest(transactional = false)
public final class CadastraPixEndPointTest {
    @org.jetbrains.annotations.NotNull
    @javax.inject.Inject
    public br.com.zup.pix.clients.BancoCentralClient bcbClient;
    @org.jetbrains.annotations.NotNull
    @javax.inject.Inject
    public br.com.zup.pix.clients.ContasClientesItauClient itauClient;
    @org.jetbrains.annotations.NotNull
    private final br.com.zup.pix.repositories.PixRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.zup.KeyManagerCadastraGrpcServiceGrpc.KeyManagerCadastraGrpcServiceBlockingStub grpcCliente = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.UUID CLIENTE_ID = null;
    public static final br.com.zup.pix.cadastra.CadastraPixEndPointTest.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.clients.BancoCentralClient getBcbClient() {
        return null;
    }
    
    public final void setBcbClient(@org.jetbrains.annotations.NotNull
    br.com.zup.pix.clients.BancoCentralClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.clients.ContasClientesItauClient getItauClient() {
        return null;
    }
    
    public final void setItauClient(@org.jetbrains.annotations.NotNull
    br.com.zup.pix.clients.ContasClientesItauClient p0) {
    }
    
    @org.junit.jupiter.api.BeforeEach
    public final void set() {
    }
    
    private final br.com.zup.pix.bcb.CreatePixKeyResponse chavePixKeyResponse() {
        return null;
    }
    
    private final br.com.zup.pix.itau.ContaResponse dadosDaContaResponse() {
        return null;
    }
    
    private final br.com.zup.pix.bcb.CreatePixKeyRequest chavePixKeyRequest() {
        return null;
    }
    
    private final br.com.zup.pix.bcb.BankAccount bankAccount() {
        return null;
    }
    
    private final br.com.zup.pix.bcb.Owner owner() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.test.annotation.MockBean(value = br.com.zup.pix.clients.BancoCentralClient.class)
    public final br.com.zup.pix.clients.BancoCentralClient bcbClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.test.annotation.MockBean(value = br.com.zup.pix.clients.ContasClientesItauClient.class)
    public final br.com.zup.pix.clients.ContasClientesItauClient itauClient() {
        return null;
    }
    
    private final br.com.zup.pix.itau.Pix chave() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.repositories.PixRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.KeyManagerCadastraGrpcServiceGrpc.KeyManagerCadastraGrpcServiceBlockingStub getGrpcCliente() {
        return null;
    }
    
    public CadastraPixEndPointTest(@org.jetbrains.annotations.NotNull
    br.com.zup.pix.repositories.PixRepository repository, @org.jetbrains.annotations.NotNull
    br.com.zup.KeyManagerCadastraGrpcServiceGrpc.KeyManagerCadastraGrpcServiceBlockingStub grpcCliente) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lbr/com/zup/pix/cadastra/CadastraPixEndPointTest$ClientGrpc;", "", "()V", "stub", "Lbr/com/zup/KeyManagerCadastraGrpcServiceGrpc$KeyManagerCadastraGrpcServiceBlockingStub;", "channel", "Lio/grpc/ManagedChannel;", "key-manager-grpc"})
    @io.micronaut.context.annotation.Factory
    public static final class ClientGrpc {
        
        @org.jetbrains.annotations.NotNull
        @io.micronaut.context.annotation.Bean
        public final br.com.zup.KeyManagerCadastraGrpcServiceGrpc.KeyManagerCadastraGrpcServiceBlockingStub stub(@org.jetbrains.annotations.NotNull
        @io.micronaut.grpc.annotation.GrpcChannel(value = "grpc-server")
        io.grpc.ManagedChannel channel) {
            return null;
        }
        
        public ClientGrpc() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lbr/com/zup/pix/cadastra/CadastraPixEndPointTest$Companion;", "", "()V", "CLIENTE_ID", "Ljava/util/UUID;", "getCLIENTE_ID", "()Ljava/util/UUID;", "key-manager-grpc"})
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