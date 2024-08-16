package com.example.spring_jsp_demo.service;

import com.example.spring_jsp_demo.controller.bean.User;

public interface UserService {
	
	User getUserByUserId(String user);
	
	int createNewUser(User user);
}
