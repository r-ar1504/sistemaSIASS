package com.sistemaSIASS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String welcome(Model model) {
		//model.addAttribute("greeting", "Welcome to Web Store!");
		//model.addAttribute("tagline", "The one and only amazing web store");
		return "index";
	}
}