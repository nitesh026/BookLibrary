package com.book.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.library.entity.UserRegistration;
import com.book.library.repository.UserRegistrationRepo;

@Service
public class UserRegistrationService {
	
	@Autowired
	UserRegistrationRepo userRegistrationRepo;
	
	public String userRegistration(UserRegistration user) {
		userRegistrationRepo.save(user);
		return "User registerd successfully";
	}

}
