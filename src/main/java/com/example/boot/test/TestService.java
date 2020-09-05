package com.example.boot.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boot.bean.Diary;
import com.example.boot.repository.DiaryRepository;

@Service
public class TestService {

	@Autowired
	private DiaryRepository repository;
	
	public List<Diary> get() {
		return repository.findAll();
	}

	public Diary insert(Diary diary) {
		return repository.save(diary);
	}

	public boolean delete(Diary diary) {
		repository.deleteById(diary.getSeq());
		return repository.findById(diary.getSeq()).orElseGet(null) == null;
	}

}
