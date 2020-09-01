package com.example.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.boot.bean.UserInfo;
import com.example.boot.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public UserInfo join(UserInfo user) {
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		return repository.save(user);
	}
	
	
}
