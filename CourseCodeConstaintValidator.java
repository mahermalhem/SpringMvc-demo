package mvcPackage.Validation1;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class CourseCodeConstaintValidator
implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.Value();
	}


//here u can do anything call database look into a number or else
	@Override
	public boolean isValid(String theCode , 
		ConstraintValidatorContext constraintValidatorContext) {
		
		boolean result;
		if(theCode!=null)
			result=theCode.startsWith(coursePrefix);
		else
			result=true;
		
		return result;
	}

}
