package com.example.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.boot.bean.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Integer>{

	UserInfo findByUserId(String id);

}
