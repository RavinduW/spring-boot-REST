package com.rest.springboot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.springboot.models.UserModel;
import com.rest.springboot.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	//Autowired annotation is saying that user_service is a dependency injection to UserController
	@Autowired
	private UserService user_service;

	@RequestMapping("/all")
	public List<UserModel> getAllUsers() {
		return user_service.getAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/create")
	public String createUser(@RequestBody UserModel UserData) {
		 return user_service.saveUser(UserData);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value="/update/{id}")
	public String updateUser(@RequestBody UserModel UserData, @PathVariable int id) {
		return user_service.updateUser(UserData,id);
	}
	
	@RequestMapping("/find/{id}")
	public Optional<UserModel> getUser(@PathVariable Integer id) {
		return user_service.getUser(id);
	}
	
	
	
}
