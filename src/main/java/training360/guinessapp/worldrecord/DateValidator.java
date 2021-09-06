package training360.guinessapp.worldrecord;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class DateValidator implements ConstraintValidator<ValidDate, Valid> {

    @Override
    public void initialize(ValidDate constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Valid valid, ConstraintValidatorContext constraintValidatorContext) {
        return valid.getDate().isBefore(LocalDate.now());
    }
}
