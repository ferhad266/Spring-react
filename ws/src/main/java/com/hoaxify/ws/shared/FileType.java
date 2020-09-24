package com.hoaxify.ws.shared;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {FileTypeValidator.class})
public @interface FileType {
    String message() default "{hoaxify.constraint.ProfileImage.message}";

    Class<?>[] groups() default {};

    Class<? extends javax.validation.Payload>[] payload() default {};

    String[] types();
}
