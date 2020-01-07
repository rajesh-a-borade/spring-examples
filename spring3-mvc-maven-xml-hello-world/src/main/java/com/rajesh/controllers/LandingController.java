package com.rajesh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LandingController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		System.out.println("/landing controller called ....");
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "index";

	}
}
