package com.first.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.entity.User;
import com.first.repository.userRepo;

@Service
public class userService {

	@Autowired
	private userRepo repo;
	
	public Optional<User> saveUser(User u) {
		
		repo.save(u);
		//repo.save(u1);
		
		Optional<User> user = repo.findById(102);	
		System.out.println("User Found :: " + user);
		return user;
		
	}
}
