package com.cognizant.caseStudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.caseStudy.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	@GetMapping("/")
	public String renderLoginPage(ModelMap model) {
		return "login";
	}
	
	@PostMapping("/")
	public String renderWelcome(@RequestParam String name, @RequestParam String password,
			ModelMap model) {
	if(!loginService.auth(name, password)) {
		model.addAttribute("msg", "Inavalid Username or Password");
		return "login";
	}
	model.addAttribute("name", name);
	model.addAttribute("password", password);
	return "welcome";
	}
}
