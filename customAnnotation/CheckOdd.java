package com.example.demoAnnotation.customAnnotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NumberValidation.class)
public @interface CheckOdd {

    Class<?>[] groups() default {};

    String message() default "the integer must be odd!";

    Class<? extends Payload>[] payload() default {};
}
