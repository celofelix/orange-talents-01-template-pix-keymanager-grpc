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
public final class KeyManagerBuscaChaveGrpcServiceGrpc {

  private KeyManagerBuscaChaveGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.KeyManagerBuscaChaveGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.BuscaPorChavePixRequest,
      br.com.zup.DetalhesChavePixResponse> getBuscaPorChaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "buscaPorChave",
      requestType = br.com.zup.BuscaPorChavePixRequest.class,
      responseType = br.com.zup.DetalhesChavePixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.BuscaPorChavePixRequest,
      br.com.zup.DetalhesChavePixResponse> getBuscaPorChaveMethod() {
    io.grpc.MethodDescriptor<br.com.zup.BuscaPorChavePixRequest, br.com.zup.DetalhesChavePixResponse> getBuscaPorChaveMethod;
    if ((getBuscaPorChaveMethod = KeyManagerBuscaChaveGrpcServiceGrpc.getBuscaPorChaveMethod) == null) {
      synchronized (KeyManagerBuscaChaveGrpcServiceGrpc.class) {
        if ((getBuscaPorChaveMethod = KeyManagerBuscaChaveGrpcServiceGrpc.getBuscaPorChaveMethod) == null) {
          KeyManagerBuscaChaveGrpcServiceGrpc.getBuscaPorChaveMethod = getBuscaPorChaveMethod =
              io.grpc.MethodDescriptor.<br.com.zup.BuscaPorChavePixRequest, br.com.zup.DetalhesChavePixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "buscaPorChave"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.BuscaPorChavePixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.DetalhesChavePixResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagerBuscaChaveGrpcServiceMethodDescriptorSupplier("buscaPorChave"))
              .build();
        }
      }
    }
    return getBuscaPorChaveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyManagerBuscaChaveGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerBuscaChaveGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerBuscaChaveGrpcServiceStub>() {
        @java.lang.Override
        public KeyManagerBuscaChaveGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerBuscaChaveGrpcServiceStub(channel, callOptions);
        }
      };
    return KeyManagerBuscaChaveGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyManagerBuscaChaveGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerBuscaChaveGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerBuscaChaveGrpcServiceBlockingStub>() {
        @java.lang.Override
        public KeyManagerBuscaChaveGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerBuscaChaveGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return KeyManagerBuscaChaveGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyManagerBuscaChaveGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerBuscaChaveGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerBuscaChaveGrpcServiceFutureStub>() {
        @java.lang.Override
        public KeyManagerBuscaChaveGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerBuscaChaveGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return KeyManagerBuscaChaveGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeyManagerBuscaChaveGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void buscaPorChave(br.com.zup.BuscaPorChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.DetalhesChavePixResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBuscaPorChaveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBuscaPorChaveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.BuscaPorChavePixRequest,
                br.com.zup.DetalhesChavePixResponse>(
                  this, METHODID_BUSCA_POR_CHAVE)))
          .build();
    }
  }

  /**
   */
  public static final class KeyManagerBuscaChaveGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<KeyManagerBuscaChaveGrpcServiceStub> {
    private KeyManagerBuscaChaveGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerBuscaChaveGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerBuscaChaveGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void buscaPorChave(br.com.zup.BuscaPorChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.DetalhesChavePixResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBuscaPorChaveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeyManagerBuscaChaveGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeyManagerBuscaChaveGrpcServiceBlockingStub> {
    private KeyManagerBuscaChaveGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerBuscaChaveGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerBuscaChaveGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.DetalhesChavePixResponse buscaPorChave(br.com.zup.BuscaPorChavePixRequest request) {
      return blockingUnaryCall(
          getChannel(), getBuscaPorChaveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeyManagerBuscaChaveGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeyManagerBuscaChaveGrpcServiceFutureStub> {
    private KeyManagerBuscaChaveGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerBuscaChaveGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerBuscaChaveGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.DetalhesChavePixResponse> buscaPorChave(
        br.com.zup.BuscaPorChavePixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBuscaPorChaveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BUSCA_POR_CHAVE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyManagerBuscaChaveGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyManagerBuscaChaveGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BUSCA_POR_CHAVE:
          serviceImpl.buscaPorChave((br.com.zup.BuscaPorChavePixRequest) request,
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

  private static abstract class KeyManagerBuscaChaveGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyManagerBuscaChaveGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.KeyManagerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyManagerBuscaChaveGrpcService");
    }
  }

  private static final class KeyManagerBuscaChaveGrpcServiceFileDescriptorSupplier
      extends KeyManagerBuscaChaveGrpcServiceBaseDescriptorSupplier {
    KeyManagerBuscaChaveGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class KeyManagerBuscaChaveGrpcServiceMethodDescriptorSupplier
      extends KeyManagerBuscaChaveGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyManagerBuscaChaveGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeyManagerBuscaChaveGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyManagerBuscaChaveGrpcServiceFileDescriptorSupplier())
              .addMethod(getBuscaPorChaveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
