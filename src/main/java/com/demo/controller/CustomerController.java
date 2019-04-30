package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	
	@GetMapping("/spring")
	public String showSpring(){
		return "hello-world";
	}
	
	@GetMapping("/home")
	public String showHome(){
		return "home";
	}
	
	
	
}