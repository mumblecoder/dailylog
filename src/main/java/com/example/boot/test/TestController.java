package com.example.boot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot.bean.Diary;

@RestController
@RequestMapping(value = "/test")
public class TestController {

	@Autowired
	private TestService service;
	
	@GetMapping
	public ResponseEntity<?> get(){
		return ResponseEntity.ok(service.get());
	}
	
	@PostMapping
	public ResponseEntity<?> insert(@RequestBody Diary diary){
		return ResponseEntity.ok(service.insert(diary));
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Diary diary){
		return ResponseEntity.ok(service.delete(diary));
	}
	
}
