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
public final class KeyManagerBuscaChavePorIDGrpcServiceGrpc {

  private KeyManagerBuscaChavePorIDGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.KeyManagerBuscaChavePorIDGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.BuscaChavePorIDPixRequest,
      br.com.zup.DetalhesChavePixResponse> getBuscaChavePorIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "buscaChavePorID",
      requestType = br.com.zup.BuscaChavePorIDPixRequest.class,
      responseType = br.com.zup.DetalhesChavePixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.BuscaChavePorIDPixRequest,
      br.com.zup.DetalhesChavePixResponse> getBuscaChavePorIDMethod() {
    io.grpc.MethodDescriptor<br.com.zup.BuscaChavePorIDPixRequest, br.com.zup.DetalhesChavePixResponse> getBuscaChavePorIDMethod;
    if ((getBuscaChavePorIDMethod = KeyManagerBuscaChavePorIDGrpcServiceGrpc.getBuscaChavePorIDMethod) == null) {
      synchronized (KeyManagerBuscaChavePorIDGrpcServiceGrpc.class) {
        if ((getBuscaChavePorIDMethod = KeyManagerBuscaChavePorIDGrpcServiceGrpc.getBuscaChavePorIDMethod) == null) {
          KeyManagerBuscaChavePorIDGrpcServiceGrpc.getBuscaChavePorIDMethod = getBuscaChavePorIDMethod =
              io.grpc.MethodDescriptor.<br.com.zup.BuscaChavePorIDPixRequest, br.com.zup.DetalhesChavePixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "buscaChavePorID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.BuscaChavePorIDPixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.DetalhesChavePixResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagerBuscaChavePorIDGrpcServiceMethodDescriptorSupplier("buscaChavePorID"))
              .build();
        }
      }
    }
    return getBuscaChavePorIDMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyManagerBuscaChavePorIDGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerBuscaChavePorIDGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerBuscaChavePorIDGrpcServiceStub>() {
        @java.lang.Override
        public KeyManagerBuscaChavePorIDGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerBuscaChavePorIDGrpcServiceStub(channel, callOptions);
        }
      };
    return KeyManagerBuscaChavePorIDGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyManagerBuscaChavePorIDGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerBuscaChavePorIDGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerBuscaChavePorIDGrpcServiceBlockingStub>() {
        @java.lang.Override
        public KeyManagerBuscaChavePorIDGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerBuscaChavePorIDGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return KeyManagerBuscaChavePorIDGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyManagerBuscaChavePorIDGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerBuscaChavePorIDGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerBuscaChavePorIDGrpcServiceFutureStub>() {
        @java.lang.Override
        public KeyManagerBuscaChavePorIDGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerBuscaChavePorIDGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return KeyManagerBuscaChavePorIDGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeyManagerBuscaChavePorIDGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void buscaChavePorID(br.com.zup.BuscaChavePorIDPixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.DetalhesChavePixResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBuscaChavePorIDMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBuscaChavePorIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.BuscaChavePorIDPixRequest,
                br.com.zup.DetalhesChavePixResponse>(
                  this, METHODID_BUSCA_CHAVE_POR_ID)))
          .build();
    }
  }

  /**
   */
  public static final class KeyManagerBuscaChavePorIDGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<KeyManagerBuscaChavePorIDGrpcServiceStub> {
    private KeyManagerBuscaChavePorIDGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerBuscaChavePorIDGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerBuscaChavePorIDGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void buscaChavePorID(br.com.zup.BuscaChavePorIDPixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.DetalhesChavePixResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBuscaChavePorIDMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeyManagerBuscaChavePorIDGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeyManagerBuscaChavePorIDGrpcServiceBlockingStub> {
    private KeyManagerBuscaChavePorIDGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerBuscaChavePorIDGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerBuscaChavePorIDGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.DetalhesChavePixResponse buscaChavePorID(br.com.zup.BuscaChavePorIDPixRequest request) {
      return blockingUnaryCall(
          getChannel(), getBuscaChavePorIDMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeyManagerBuscaChavePorIDGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeyManagerBuscaChavePorIDGrpcServiceFutureStub> {
    private KeyManagerBuscaChavePorIDGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerBuscaChavePorIDGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerBuscaChavePorIDGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.DetalhesChavePixResponse> buscaChavePorID(
        br.com.zup.BuscaChavePorIDPixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBuscaChavePorIDMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BUSCA_CHAVE_POR_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyManagerBuscaChavePorIDGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyManagerBuscaChavePorIDGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BUSCA_CHAVE_POR_ID:
          serviceImpl.buscaChavePorID((br.com.zup.BuscaChavePorIDPixRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.DetalhesChavePixResponse>) responseObserver);
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

  private static abstract class KeyManagerBuscaChavePorIDGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyManagerBuscaChavePorIDGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.KeyManagerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyManagerBuscaChavePorIDGrpcService");
    }
  }

  private static final class KeyManagerBuscaChavePorIDGrpcServiceFileDescriptorSupplier
      extends KeyManagerBuscaChavePorIDGrpcServiceBaseDescriptorSupplier {
    KeyManagerBuscaChavePorIDGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class KeyManagerBuscaChavePorIDGrpcServiceMethodDescriptorSupplier
      extends KeyManagerBuscaChavePorIDGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyManagerBuscaChavePorIDGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeyManagerBuscaChavePorIDGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyManagerBuscaChavePorIDGrpcServiceFileDescriptorSupplier())
              .addMethod(getBuscaChavePorIDMethod())
              .build();
        }
      }
    }
    return result;
  }
}
