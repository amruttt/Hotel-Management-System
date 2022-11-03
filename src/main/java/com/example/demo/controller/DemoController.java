package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@RequestMapping("/hotel")
	public String index() {
		System.out.println("This is index controller");
		return "index";
	}
	
	@RequestMapping("/cuslogin")
	public String cuslogin() {
		System.out.println("This is customer login controller");
		return "cuslogin";
	}
	
	@RequestMapping("/venlogin")
	public String venlogin() {
		System.out.println("This is Vendor login controller");
		return "venlogin";
	}
}
