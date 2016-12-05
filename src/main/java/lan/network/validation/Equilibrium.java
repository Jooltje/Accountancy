package lan.network.validation;

import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EquilibriumValidator.class)
@Documented
public @interface Equilibrium {

	String message() default "{lan.network.validation.equilibrium}";
	
	Class<? extends Payload>[] payload() default {};
	
	Class<?>[] groups() default {};
	
}
