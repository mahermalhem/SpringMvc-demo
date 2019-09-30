package mvcPackage;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import mvcPackage.Validation1.CourseCode;

public class Customer {

	private String firstName;
	
	
	@NotNull(message = "is required")
	@Size(min=2 , message = "more than 2 chars")
	private String lastName;
	
	@NotNull(message = "is required")
	@Min(value = 2, message = "must be 2 or more")
	@Max(value = 10,message = "sholdn`t be more than 10")
	private Integer freePasses;
	//we put integer be cause it can gives null
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}" , message = "only 5 chars/digits")
	private String postalCode;
	
	@CourseCode(Value = "ki" ,message = "helo")
	private String courseCode;
	

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
}
