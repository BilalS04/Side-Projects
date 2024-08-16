package com.example.spring_jsp_demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_jsp_demo.controller.bean.User;
import com.example.spring_jsp_demo.dao.UserDao;
import com.example.spring_jsp_demo.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	
	@Override
	public User getUserByUserId(String userId) {
		User user = userDao.getUserById(userId);
		return user;
	}

	@Override
	public int createNewUser(User user) {
		return userDao.createNewUser(user);
	}
}
