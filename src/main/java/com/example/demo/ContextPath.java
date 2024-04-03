package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContextPath {

	@GetMapping("/welcome")
	public String displayWelcomeMsg(Model model) {                     // model to send data from Controller to UI 
		String msgtext = "Akhil Pillamgolla";
		 model.addAttribute("msg", msgtext);   
		return "index";
	}
	
	
}
 