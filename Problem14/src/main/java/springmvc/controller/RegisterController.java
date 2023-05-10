package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	/*
	 * Using Model class and request parameter
	 */
	@RequestMapping("/register")
	public String register() {
		System.out.println("This is Registration Page for Model object class and RequestParam Annotation");
		return("register");
		
		
	}
	// path is url pattern
	@RequestMapping(path="processform", method=RequestMethod.POST)
	public String process(@RequestParam("uname") String username,
			@RequestParam("email") String email,
			@RequestParam("pwd") String password,  Model m) {
		
		m.addAttribute("name", username);
		m.addAttribute("email", email);
		m.addAttribute("password",password);
		return("success");		
	}
	
	/*
	 * Using Model and View Class and Request Parameter
	*/
	@RequestMapping("/register2")
	public String register2() {
		System.out.println("This is Registration Page for Model and View class and RequestParam Annotation");
		return("register2");
		
		
	}
	
	@RequestMapping(path="processform2", method=RequestMethod.POST)
	public ModelAndView process2(@RequestParam("uname") String username,
			@RequestParam("email") String email,
			@RequestParam("pwd") String password) {
		System.out.println("This is Contact Page");
		ModelAndView m1 = new ModelAndView();
		m1.addObject("name", username);
		m1.addObject("email", email);
		m1.addObject("password",password);
		m1.setViewName("success");
		return(m1);		
	}

}
