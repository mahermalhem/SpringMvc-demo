package mvcPackage;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		//create new student obj
		Student theStudent=new Student();
		//add that obj to model
		theModel.addAttribute("student",theStudent);
		
		return "student-form";
		
	}
	
	@RequestMapping("/processStudentForm")
	public String processForm(@Valid @ModelAttribute("student")Student theStudent ,BindingResult theBindingResult ) {
		
		System.out.print(theStudent.getFirstName()
				+" "+
				theStudent.getLastName()
				+" \n and your country is:"+
				theStudent.getCountry()
				+"\n"+
				theStudent.getFavLang()
				);
		//
		
		return "student-confirmation";
	}
}
