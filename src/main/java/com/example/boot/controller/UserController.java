package com.example.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot.bean.UserInfo;
import com.example.boot.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping()
	public ResponseEntity<?> join(@RequestBody UserInfo user){
		System.out.println("dddd");
		return ResponseEntity.ok(service.join(user));
	}
	
}
