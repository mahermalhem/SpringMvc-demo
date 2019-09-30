package mvcPackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/hello")
public class SillyController {

	@RequestMapping("/showForm")
	public String  displaytheForm() {
		System.out.print("dda");
		return "helloWorld-form";
	}
}
