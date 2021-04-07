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
public final class KeyManagerCadastraGrpcServiceGrpc {

  private KeyManagerCadastraGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.KeyManagerCadastraGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.CadastraChavePixRequest,
      br.com.zup.CadastraChavePixResponse> getRegistraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registra",
      requestType = br.com.zup.CadastraChavePixRequest.class,
      responseType = br.com.zup.CadastraChavePixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.CadastraChavePixRequest,
      br.com.zup.CadastraChavePixResponse> getRegistraMethod() {
    io.grpc.MethodDescriptor<br.com.zup.CadastraChavePixRequest, br.com.zup.CadastraChavePixResponse> getRegistraMethod;
    if ((getRegistraMethod = KeyManagerCadastraGrpcServiceGrpc.getRegistraMethod) == null) {
      synchronized (KeyManagerCadastraGrpcServiceGrpc.class) {
        if ((getRegistraMethod = KeyManagerCadastraGrpcServiceGrpc.getRegistraMethod) == null) {
          KeyManagerCadastraGrpcServiceGrpc.getRegistraMethod = getRegistraMethod =
              io.grpc.MethodDescriptor.<br.com.zup.CadastraChavePixRequest, br.com.zup.CadastraChavePixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "registra"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.CadastraChavePixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.CadastraChavePixResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagerCadastraGrpcServiceMethodDescriptorSupplier("registra"))
              .build();
        }
      }
    }
    return getRegistraMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyManagerCadastraGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerCadastraGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerCadastraGrpcServiceStub>() {
        @java.lang.Override
        public KeyManagerCadastraGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerCadastraGrpcServiceStub(channel, callOptions);
        }
      };
    return KeyManagerCadastraGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyManagerCadastraGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerCadastraGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerCadastraGrpcServiceBlockingStub>() {
        @java.lang.Override
        public KeyManagerCadastraGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerCadastraGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return KeyManagerCadastraGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyManagerCadastraGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerCadastraGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerCadastraGrpcServiceFutureStub>() {
        @java.lang.Override
        public KeyManagerCadastraGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerCadastraGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return KeyManagerCadastraGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeyManagerCadastraGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registra(br.com.zup.CadastraChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.CadastraChavePixResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegistraMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegistraMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.CadastraChavePixRequest,
                br.com.zup.CadastraChavePixResponse>(
                  this, METHODID_REGISTRA)))
          .build();
    }
  }

  /**
   */
  public static final class KeyManagerCadastraGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<KeyManagerCadastraGrpcServiceStub> {
    private KeyManagerCadastraGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerCadastraGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerCadastraGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void registra(br.com.zup.CadastraChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.CadastraChavePixResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegistraMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeyManagerCadastraGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeyManagerCadastraGrpcServiceBlockingStub> {
    private KeyManagerCadastraGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerCadastraGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerCadastraGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.CadastraChavePixResponse registra(br.com.zup.CadastraChavePixRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegistraMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeyManagerCadastraGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeyManagerCadastraGrpcServiceFutureStub> {
    private KeyManagerCadastraGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerCadastraGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerCadastraGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.CadastraChavePixResponse> registra(
        br.com.zup.CadastraChavePixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegistraMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTRA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyManagerCadastraGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyManagerCadastraGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTRA:
          serviceImpl.registra((br.com.zup.CadastraChavePixRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.CadastraChavePixResponse>) responseObserver);
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

  private static abstract class KeyManagerCadastraGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyManagerCadastraGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.KeyManagerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyManagerCadastraGrpcService");
    }
  }

  private static final class KeyManagerCadastraGrpcServiceFileDescriptorSupplier
      extends KeyManagerCadastraGrpcServiceBaseDescriptorSupplier {
    KeyManagerCadastraGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class KeyManagerCadastraGrpcServiceMethodDescriptorSupplier
      extends KeyManagerCadastraGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyManagerCadastraGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeyManagerCadastraGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyManagerCadastraGrpcServiceFileDescriptorSupplier())
              .addMethod(getRegistraMethod())
              .build();
        }
      }
    }
    return result;
  }
}
