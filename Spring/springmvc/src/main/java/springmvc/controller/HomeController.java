package springmvc.controller;

import java.util.List;



import java.time.LocalDateTime;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(){
		System.out.println("This is home Page");
		
		return "index";
	}
		@RequestMapping("/about")
		public String about() {
			System.out.println("This is aboutPage");
			return "about";
	}
		@RequestMapping("/help")
		public String help(Model m) {
			m.addAttribute("name","MIT");
			m.addAttribute("id",1234);
			return("help");
			
		}
		@RequestMapping("/contact")
		public ModelAndView contact() {
			System.out.println("This is Contact Page");
			ModelAndView m1 = new ModelAndView();
			m1.addObject("name","MITAOE");
			m1.addObject("id",9876);
			m1.setViewName("contact");
			return(m1);
			
		}
}
