package com.example.spring_jsp_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.spring_jsp_demo.controller.bean.User;
import com.example.spring_jsp_demo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap model, @RequestParam String userId, @RequestParam String password) {
		User user = userService.getUserByUserId(userId);
		
		
		if(user.getPassword().equals(password)) {
			model.put("userId", userId);
			return "welcome";
		}
		
		model.put("errorMsg", "Please provide the correct userid and password");
		return "login";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerPage(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, Model model) {
	    int count = userService.createNewUser(user);
	    
	    if (count != 1) {
	        model.addAttribute("errorMsg", "Some issue occurred with registration");
	        return "register";
	    }
	    
	    model.addAttribute("successMsg", "User created successfully!!");
	    return "login";
	}
}
