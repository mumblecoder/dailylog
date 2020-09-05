package com.example.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.boot.bean.Diary;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer> {
	
}
