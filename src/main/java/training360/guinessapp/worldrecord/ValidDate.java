package training360.guinessapp.worldrecord;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @Constraint(validatedBy = DateValidator.class)
    public @interface ValidDate {

        String message() default "must be in the past";

        Class<?>[] groups() default {};

        Class<? extends Payload>[] payload() default {};
    }
