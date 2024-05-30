package com.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.first.entity.User;
import com.first.service.userService;

@Controller
public class userController {
	//user controller
	@Autowired
	private userService service;

	@RequestMapping("/")
	public String home() {

		User u = new User();
		u.setUserId(101);
		u.setUserName("Sam");
		u.setUserAddr("IND");
		
		User u1 = new User();
		u1.setUserId(102);
		u1.setUserName("Jack");
		u1.setUserAddr("USA");
		
		System.out.println("user data :: " + u);
		System.out.println("user data :: " + u1);
		service.saveUser(u);
		
		return "index";
	}
	

}
















