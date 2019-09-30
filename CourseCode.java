package mvcPackage.Validation1;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = CourseCodeConstaintValidator.class)
@Target( {ElementType.METHOD , ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	//define defauly course code
	public String Value() default "LUV";
	//define default error message
	public String message() default "must start with LUV";
	//define default groubs
	public Class<?>[] groups () default {};
	//defin default payloads
	public Class<? extends Payload>[] payload() default {};

}
