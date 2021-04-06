package br.com.zup.pix.excecoes

import io.micronaut.aop.Around
import io.micronaut.context.annotation.Type

@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FILE, AnnotationTarget.PROPERTY)
@Around
@Type(ExceptionHandlerInterceptor::class)
annotation class ErrorHandler
