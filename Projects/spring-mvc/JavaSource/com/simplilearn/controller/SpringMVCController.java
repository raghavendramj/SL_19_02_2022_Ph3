package com.simplilearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringMVCController {

	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String prepareView(Model model) {
		model.addAttribute("message", "Spring MVC QuickStart");
		return "view-spring";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String myView(Model model) {
		model.addAttribute("secondMessage", "From Second Method - Spring MVC QuickStart");
		return "second-spring";
	}
}
