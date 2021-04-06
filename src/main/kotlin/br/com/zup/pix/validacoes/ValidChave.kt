package br.com.zup.pix.validacoes

import br.com.zup.pix.itau.NovaChave
import io.micronaut.core.annotation.AnnotationValue
import io.micronaut.validation.validator.constraints.ConstraintValidator
import io.micronaut.validation.validator.constraints.ConstraintValidatorContext
import javax.inject.Singleton
import javax.validation.Constraint
import javax.validation.Payload
import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.CLASS
import kotlin.annotation.AnnotationTarget.TYPE
import kotlin.reflect.KClass

@MustBeDocumented
@Target(CLASS, TYPE)
@Retention(RUNTIME)
@Constraint(validatedBy = [ValidChaveValidator::class])
annotation class ValidChave(
    val message: String = "Chave pix informada está inválida (\$validatedValue.tipo)",
    val groups: Array<KClass<Any>> = [],
    val payload: Array<KClass<Payload>> = []
)

@Singleton
class ValidChaveValidator : ConstraintValidator<ValidChave, NovaChave> {

    override fun isValid(
        value: NovaChave,
        annotationMetadata: AnnotationValue<ValidChave>,
        context: ConstraintValidatorContext
    ): Boolean {
        if (value.tipoDeChave == null) {
            return false
        }
        return value.tipoDeChave.valida(value.chave)
    }
}
