package com.example.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@GetMapping("/")
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView("main");
		return mav;
	}
	
	@GetMapping("/calendar")
	public ModelAndView calendar() {
		ModelAndView mav = new ModelAndView("calendar");
		return mav;
	}
	
	@GetMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
}
