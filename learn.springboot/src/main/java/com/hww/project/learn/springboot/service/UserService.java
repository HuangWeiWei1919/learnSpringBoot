package com.hww.project.learn.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hww.project.learn.springboot.mapper.UserMapper;
import com.hww.project.learn.springboot.model.User;

@Service
public class UserService {
	
	 @Autowired
	 private UserMapper userMapper;

	public User getUserInfo() {
		return userMapper.findUserInfo();	
	}
	
	public List<User> getAllUser(){
		return userMapper.getAllUser();
	} 
	
	public User getUserByName(String name){
		return userMapper.getUserByName(name);
	}


}
