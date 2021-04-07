package br.com.zup;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: keyManagerGrpc.proto")
public final class KeyManagerListaChavesGrpcServiceGrpc {

  private KeyManagerListaChavesGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.KeyManagerListaChavesGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.ListaChavesPixRequest,
      br.com.zup.ListaChavesResponse> getListaChavesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listaChaves",
      requestType = br.com.zup.ListaChavesPixRequest.class,
      responseType = br.com.zup.ListaChavesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.ListaChavesPixRequest,
      br.com.zup.ListaChavesResponse> getListaChavesMethod() {
    io.grpc.MethodDescriptor<br.com.zup.ListaChavesPixRequest, br.com.zup.ListaChavesResponse> getListaChavesMethod;
    if ((getListaChavesMethod = KeyManagerListaChavesGrpcServiceGrpc.getListaChavesMethod) == null) {
      synchronized (KeyManagerListaChavesGrpcServiceGrpc.class) {
        if ((getListaChavesMethod = KeyManagerListaChavesGrpcServiceGrpc.getListaChavesMethod) == null) {
          KeyManagerListaChavesGrpcServiceGrpc.getListaChavesMethod = getListaChavesMethod =
              io.grpc.MethodDescriptor.<br.com.zup.ListaChavesPixRequest, br.com.zup.ListaChavesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listaChaves"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.ListaChavesPixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.ListaChavesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagerListaChavesGrpcServiceMethodDescriptorSupplier("listaChaves"))
              .build();
        }
      }
    }
    return getListaChavesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyManagerListaChavesGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerListaChavesGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerListaChavesGrpcServiceStub>() {
        @java.lang.Override
        public KeyManagerListaChavesGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerListaChavesGrpcServiceStub(channel, callOptions);
        }
      };
    return KeyManagerListaChavesGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyManagerListaChavesGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerListaChavesGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerListaChavesGrpcServiceBlockingStub>() {
        @java.lang.Override
        public KeyManagerListaChavesGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerListaChavesGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return KeyManagerListaChavesGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyManagerListaChavesGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerListaChavesGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerListaChavesGrpcServiceFutureStub>() {
        @java.lang.Override
        public KeyManagerListaChavesGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerListaChavesGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return KeyManagerListaChavesGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeyManagerListaChavesGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listaChaves(br.com.zup.ListaChavesPixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.ListaChavesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListaChavesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListaChavesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.ListaChavesPixRequest,
                br.com.zup.ListaChavesResponse>(
                  this, METHODID_LISTA_CHAVES)))
          .build();
    }
  }

  /**
   */
  public static final class KeyManagerListaChavesGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<KeyManagerListaChavesGrpcServiceStub> {
    private KeyManagerListaChavesGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerListaChavesGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerListaChavesGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void listaChaves(br.com.zup.ListaChavesPixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.ListaChavesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListaChavesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeyManagerListaChavesGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeyManagerListaChavesGrpcServiceBlockingStub> {
    private KeyManagerListaChavesGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerListaChavesGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerListaChavesGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.ListaChavesResponse listaChaves(br.com.zup.ListaChavesPixRequest request) {
      return blockingUnaryCall(
          getChannel(), getListaChavesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeyManagerListaChavesGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeyManagerListaChavesGrpcServiceFutureStub> {
    private KeyManagerListaChavesGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerListaChavesGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerListaChavesGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.ListaChavesResponse> listaChaves(
        br.com.zup.ListaChavesPixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListaChavesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LISTA_CHAVES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyManagerListaChavesGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyManagerListaChavesGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LISTA_CHAVES:
          serviceImpl.listaChaves((br.com.zup.ListaChavesPixRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.ListaChavesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class KeyManagerListaChavesGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyManagerListaChavesGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.KeyManagerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyManagerListaChavesGrpcService");
    }
  }

  private static final class KeyManagerListaChavesGrpcServiceFileDescriptorSupplier
      extends KeyManagerListaChavesGrpcServiceBaseDescriptorSupplier {
    KeyManagerListaChavesGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class KeyManagerListaChavesGrpcServiceMethodDescriptorSupplier
      extends KeyManagerListaChavesGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyManagerListaChavesGrpcServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KeyManagerListaChavesGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyManagerListaChavesGrpcServiceFileDescriptorSupplier())
              .addMethod(getListaChavesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
