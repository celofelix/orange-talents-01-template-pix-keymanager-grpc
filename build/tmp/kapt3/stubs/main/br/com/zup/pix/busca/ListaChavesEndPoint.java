package br.com.zup.pix.busca;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lbr/com/zup/pix/busca/ListaChavesEndPoint;", "Lbr/com/zup/KeyManagerListaChavesGrpcServiceGrpc$KeyManagerListaChavesGrpcServiceImplBase;", "pixRepository", "Lbr/com/zup/pix/repositories/PixRepository;", "(Lbr/com/zup/pix/repositories/PixRepository;)V", "getPixRepository", "()Lbr/com/zup/pix/repositories/PixRepository;", "listaChaves", "", "request", "Lbr/com/zup/ListaChavesPixRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lbr/com/zup/ListaChavesResponse;", "key-manager-grpc"})
@javax.inject.Singleton
@br.com.zup.pix.excecoes.ErrorHandler
public class ListaChavesEndPoint extends br.com.zup.KeyManagerListaChavesGrpcServiceGrpc.KeyManagerListaChavesGrpcServiceImplBase {
    @org.jetbrains.annotations.NotNull
    @javax.inject.Inject
    private final br.com.zup.pix.repositories.PixRepository pixRepository = null;
    
    @java.lang.Override
    public void listaChaves(@org.jetbrains.annotations.NotNull
    br.com.zup.ListaChavesPixRequest request, @org.jetbrains.annotations.NotNull
    io.grpc.stub.StreamObserver<br.com.zup.ListaChavesResponse> responseObserver) {
    }
    
    @org.jetbrains.annotations.NotNull
    public br.com.zup.pix.repositories.PixRepository getPixRepository() {
        return null;
    }
    
    public ListaChavesEndPoint(@org.jetbrains.annotations.NotNull
    br.com.zup.pix.repositories.PixRepository pixRepository) {
        super();
    }
}