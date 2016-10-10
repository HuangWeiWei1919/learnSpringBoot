package com.hww.project.learn.springboot.mapper;

import java.util.List;

import com.hww.project.learn.springboot.model.User;

public interface UserMapper {
	public User findUserInfo();
	
	public List<User> getAllUser();
	
	public User getUserByName(String name);
}
