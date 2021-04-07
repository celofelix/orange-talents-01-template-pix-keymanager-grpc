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
public final class KeyManagerExcluiGrpcServiceGrpc {

  private KeyManagerExcluiGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.KeyManagerExcluiGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.ExcluiChavePixRequest,
      br.com.zup.ExcluiChavePixResponse> getExcluiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "exclui",
      requestType = br.com.zup.ExcluiChavePixRequest.class,
      responseType = br.com.zup.ExcluiChavePixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.ExcluiChavePixRequest,
      br.com.zup.ExcluiChavePixResponse> getExcluiMethod() {
    io.grpc.MethodDescriptor<br.com.zup.ExcluiChavePixRequest, br.com.zup.ExcluiChavePixResponse> getExcluiMethod;
    if ((getExcluiMethod = KeyManagerExcluiGrpcServiceGrpc.getExcluiMethod) == null) {
      synchronized (KeyManagerExcluiGrpcServiceGrpc.class) {
        if ((getExcluiMethod = KeyManagerExcluiGrpcServiceGrpc.getExcluiMethod) == null) {
          KeyManagerExcluiGrpcServiceGrpc.getExcluiMethod = getExcluiMethod =
              io.grpc.MethodDescriptor.<br.com.zup.ExcluiChavePixRequest, br.com.zup.ExcluiChavePixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "exclui"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.ExcluiChavePixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.ExcluiChavePixResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagerExcluiGrpcServiceMethodDescriptorSupplier("exclui"))
              .build();
        }
      }
    }
    return getExcluiMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyManagerExcluiGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerExcluiGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerExcluiGrpcServiceStub>() {
        @java.lang.Override
        public KeyManagerExcluiGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerExcluiGrpcServiceStub(channel, callOptions);
        }
      };
    return KeyManagerExcluiGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyManagerExcluiGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerExcluiGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerExcluiGrpcServiceBlockingStub>() {
        @java.lang.Override
        public KeyManagerExcluiGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerExcluiGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return KeyManagerExcluiGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyManagerExcluiGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerExcluiGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerExcluiGrpcServiceFutureStub>() {
        @java.lang.Override
        public KeyManagerExcluiGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerExcluiGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return KeyManagerExcluiGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeyManagerExcluiGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void exclui(br.com.zup.ExcluiChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.ExcluiChavePixResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExcluiMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExcluiMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.ExcluiChavePixRequest,
                br.com.zup.ExcluiChavePixResponse>(
                  this, METHODID_EXCLUI)))
          .build();
    }
  }

  /**
   */
  public static final class KeyManagerExcluiGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<KeyManagerExcluiGrpcServiceStub> {
    private KeyManagerExcluiGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerExcluiGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerExcluiGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void exclui(br.com.zup.ExcluiChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.ExcluiChavePixResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExcluiMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeyManagerExcluiGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeyManagerExcluiGrpcServiceBlockingStub> {
    private KeyManagerExcluiGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerExcluiGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerExcluiGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.ExcluiChavePixResponse exclui(br.com.zup.ExcluiChavePixRequest request) {
      return blockingUnaryCall(
          getChannel(), getExcluiMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeyManagerExcluiGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeyManagerExcluiGrpcServiceFutureStub> {
    private KeyManagerExcluiGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerExcluiGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerExcluiGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.ExcluiChavePixResponse> exclui(
        br.com.zup.ExcluiChavePixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExcluiMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXCLUI = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyManagerExcluiGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyManagerExcluiGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXCLUI:
          serviceImpl.exclui((br.com.zup.ExcluiChavePixRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.ExcluiChavePixResponse>) responseObserver);
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

  private static abstract class KeyManagerExcluiGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyManagerExcluiGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.KeyManagerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyManagerExcluiGrpcService");
    }
  }

  private static final class KeyManagerExcluiGrpcServiceFileDescriptorSupplier
      extends KeyManagerExcluiGrpcServiceBaseDescriptorSupplier {
    KeyManagerExcluiGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class KeyManagerExcluiGrpcServiceMethodDescriptorSupplier
      extends KeyManagerExcluiGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyManagerExcluiGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeyManagerExcluiGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyManagerExcluiGrpcServiceFileDescriptorSupplier())
              .addMethod(getExcluiMethod())
              .build();
        }
      }
    }
    return result;
  }
}
