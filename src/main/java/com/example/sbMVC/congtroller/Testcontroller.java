package com.example.sbMVC.congtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Testcontroller {
	
	@RequestMapping("/")
	public String login() {
		
		return "login";
	}
		
	@RequestMapping("login-user")
	public String loginuser(@RequestParam String username, @RequestParam String password) {
		
		System.out.println(username);
		System.out.println(password);

		System.out.println("New task")
		return "login";
	
		
	}
	

}
