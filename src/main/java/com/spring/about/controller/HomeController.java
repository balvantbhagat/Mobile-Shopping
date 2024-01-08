package com.spring.about.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

@Controller
public class HomeController {
	@RequestMapping(value = "/about" , method = RequestMethod.GET)
	public String about() {
		return "about";
		
	}
	@RequestMapping(value= "/home", method = RequestMethod.POST)
	public String home() {
		return "home";
	}

}
