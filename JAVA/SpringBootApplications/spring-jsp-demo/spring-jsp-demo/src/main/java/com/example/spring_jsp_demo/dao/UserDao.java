package com.example.spring_jsp_demo.dao;

import com.example.spring_jsp_demo.controller.bean.User;

public interface UserDao {
	
	User getUserById(String userId);
	
	int createNewUser(User user);

}
