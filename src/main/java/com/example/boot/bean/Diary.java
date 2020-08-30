package com.example.boot.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "diary")
@Data
@NoArgsConstructor
public class Diary {

	@Id
	int seq;
	@CreationTimestamp
	LocalDateTime createDt;
	@UpdateTimestamp
	LocalDateTime updateDt;
	int userSeq;
	String title;
	String content;
	LocalDate diaryDate;
	
	
}
