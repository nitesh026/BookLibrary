package com.book.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.library.entity.UserRegistration;
import com.book.library.service.UserRegistrationService;

@RestController
public class UserRegistrationController {
	
	@Autowired
	UserRegistrationService userService;
	
	@PostMapping("/saveUser")
	public String saveUser(@RequestBody UserRegistration user) {
		return userService.userRegistration(user);
	}

}
