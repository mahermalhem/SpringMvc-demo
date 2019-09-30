package mvcPackage;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
	
	
	//add ad initbinder ... to convert the sring input
	//remove all white spaces and set them to null
	
	@InitBinder
	public void InitBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
		
	}
	
	@RequestMapping("/showForm")
	public String showCustomerForm (Model theModel){
		
		theModel.addAttribute("customer",new Customer());
		
		return "customerForm";
	}
	
	
	@RequestMapping("/processForm")
	public String showCustomerConfirmation 
	(@Valid 
	 @ModelAttribute("customer") Customer theCustomer
	 ,BindingResult thBindingResult){
		
		if(thBindingResult.hasErrors())
			return "customerForm";
		else
			return "customer-confirmation";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
