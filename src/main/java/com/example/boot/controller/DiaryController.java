package com.example.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.boot.bean.Diary;
import com.example.boot.service.DiaryService;

@Controller
@RequestMapping("/diary")
public class DiaryController {

	@Autowired
	private DiaryService service;
	
	@GetMapping("/")
	public ModelAndView getDiary(int seq) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("diary",service.getDiary(seq));
		return mav;
	}
	
	@GetMapping("/list")
	public ResponseEntity<?> getDiaryList(@RequestParam int year, @RequestParam int month, @RequestParam int date){
		return ResponseEntity.ok(service.getDairyList(year, month, date));
	}
	
	@ResponseBody
	@PutMapping("/")
	public ResponseEntity<?> updateDiary(@RequestBody Diary diary){
		return ResponseEntity.ok(service.updateDiary(diary));
	}
	
	@ResponseBody
	@DeleteMapping("/")
	public ResponseEntity<?> deleteDiary(int seq){
		return ResponseEntity.ok(service.deleteDiary(seq));
	}
	
	
}
