package com.example.spring_jsp_demo.controller.bean;

public class User {
	
	private String userId;
	
	public String password;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + "]";	 
	}
	
}
