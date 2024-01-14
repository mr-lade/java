package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {
	@RequestMapping("/register")
	public String register() {
		System.out.println("This is Registration Page");
		return("register");
		
		
	}
	@RequestMapping(path="processform", method=RequestMethod.POST)
	public String process(@RequestParam("uname") String username,
			@RequestParam("email") String email,
			@RequestParam("pwd") String password,  Model m) {
		
		m.addAttribute("name", username);
		m.addAttribute("email", email);
		m.addAttribute("password",password);
		return("success");
		
		
	}

}
