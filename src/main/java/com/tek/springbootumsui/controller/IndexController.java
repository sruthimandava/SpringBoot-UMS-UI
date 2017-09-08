package com.tek.springbootumsui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String getIndexPage() {
		System.out.println("IndexController() called");
		return "UserManagement";
	}

}