package br.com.zup.pix.excecoes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\b\u0016\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00040\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004\u00a2\u0006\u0002\u0010\bB\u0017\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00042\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lbr/com/zup/pix/excecoes/ExceptionHandlerResolver;", "", "handlers", "", "Lbr/com/zup/pix/excecoes/ExceptionHandler;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "defaultHandler", "(Ljava/util/List;Lbr/com/zup/pix/excecoes/ExceptionHandler;)V", "(Ljava/util/List;)V", "resolve", "e", "key-manager-grpc"})
@javax.inject.Singleton
public final class ExceptionHandlerResolver {
    private br.com.zup.pix.excecoes.ExceptionHandler<? super java.lang.Exception> defaultHandler;
    @javax.inject.Inject
    private final java.util.List<br.com.zup.pix.excecoes.ExceptionHandler<?>> handlers = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.excecoes.ExceptionHandler<?> resolve(@org.jetbrains.annotations.NotNull
    java.lang.Exception e) {
        return null;
    }
    
    public ExceptionHandlerResolver(@org.jetbrains.annotations.NotNull
    java.util.List<? extends br.com.zup.pix.excecoes.ExceptionHandler<?>> handlers) {
        super();
    }
    
    /**
     * We can replace the default exception handler through this constructor
     * https://docs.micronaut.io/latest/guide/index.html#replaces
     */
    public ExceptionHandlerResolver(@org.jetbrains.annotations.NotNull
    java.util.List<? extends br.com.zup.pix.excecoes.ExceptionHandler<? super java.lang.Exception>> handlers, @org.jetbrains.annotations.NotNull
    br.com.zup.pix.excecoes.ExceptionHandler<? super java.lang.Exception> defaultHandler) {
        super();
    }
}