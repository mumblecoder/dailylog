package com.example.boot.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boot.bean.Diary;
import com.example.boot.repository.DiaryRepository;

@Service
public class DiaryService {
	
	@Autowired
	private DiaryRepository repository;
	
	public Diary getDiary(int seq) {
		return repository.findById(seq).orElseGet(null);
	}
	
	public Diary updateDiary(Diary diary) {
		return repository.save(diary);
	}
	
	public boolean deleteDiary(int seq) {
		repository.deleteById(seq);
		if (repository.findById(seq).orElseGet(null) == null) {
			return true;
		}
		return false;
	}

	public List<Diary> getDairyList(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate diaryDate = LocalDate.parse(date, formatter);
		return repository.findAllByDiaryDate(diaryDate);
	}
	
}
