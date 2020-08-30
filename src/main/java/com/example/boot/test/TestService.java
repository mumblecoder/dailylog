package com.example.boot.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boot.bean.Diary;

@Service
public class TestService {

	@Autowired
	private DiaryRepository repository;
	
	public List<Diary> get() {
		return repository.findAll();
	}

}