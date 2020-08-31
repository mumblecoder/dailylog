package com.example.boot.bean;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int seq;
	String userId;
	String password;
	String name;
	@CreationTimestamp
	LocalDateTime createDt;
	@UpdateTimestamp
	LocalDateTime updateDt;
	
}
