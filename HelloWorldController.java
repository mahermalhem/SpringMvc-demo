package mvcPackage;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	//need a controller method to show html form
	@RequestMapping("/showForm")
	public String showForm() {
		System.out.print("HelloWorldController");
		return ("helloWorld-form");
	}
	//method to prosses the form
	@RequestMapping("/processForm")
	public String processForm() {
		return ("helloWorld");
	}
	
	
	//new a controller method to read form data
	@RequestMapping(value = "processFormV2")
	public String letsShoutDude (HttpServletRequest request , Model model) {
		//read the request parameter from HTML 
		String theName=request.getParameter("studentName2");
		//crearte the message 
		//add message to madel
		model.addAttribute("message",theName.toUpperCase());
		
		if(theName.charAt(0)=='a')
			return "NewFile";
		else
			return "helloWorld";
	}
	
	
	@RequestMapping(value = "processFormV3")
	public String letsShoutDude2 ( 
			@RequestParam("studentName2") 
			String theName, Model model){
		
		model.addAttribute("message",theName.toUpperCase()+"  helloo maaaan");
		
		if(theName.charAt(0)=='a')
			return "NewFile";
		else
			return "helloWorld";
	}
	
	
}
