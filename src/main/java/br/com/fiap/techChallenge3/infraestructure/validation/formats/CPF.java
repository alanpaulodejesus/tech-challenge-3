package br.com.fiap.techChallenge3.infraestructure.validation.formats;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CPFValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CPF {
    String message() default "Input a valid CPF.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
