package br.com.zup.pix.validacoes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lbr/com/zup/pix/validacoes/ValidChaveValidator;", "Lio/micronaut/validation/validator/constraints/ConstraintValidator;", "Lbr/com/zup/pix/validacoes/ValidChave;", "Lbr/com/zup/pix/itau/NovaChave;", "()V", "isValid", "", "value", "annotationMetadata", "Lio/micronaut/core/annotation/AnnotationValue;", "context", "Lio/micronaut/validation/validator/constraints/ConstraintValidatorContext;", "key-manager-grpc"})
@javax.inject.Singleton
public final class ValidChaveValidator implements io.micronaut.validation.validator.constraints.ConstraintValidator<br.com.zup.pix.validacoes.ValidChave, br.com.zup.pix.itau.NovaChave> {
    
    @java.lang.Override
    public boolean isValid(@org.jetbrains.annotations.NotNull
    br.com.zup.pix.itau.NovaChave value, @org.jetbrains.annotations.NotNull
    io.micronaut.core.annotation.AnnotationValue<br.com.zup.pix.validacoes.ValidChave> annotationMetadata, @org.jetbrains.annotations.NotNull
    io.micronaut.validation.validator.constraints.ConstraintValidatorContext context) {
        return false;
    }
    
    public ValidChaveValidator() {
        super();
    }
}