package com.rest.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.springboot.models.UserModel;
import com.rest.springboot.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository user_repository;
	
	public List<UserModel> getAllUsers() {
		List<UserModel> list_of_users = user_repository.findAll();
		return list_of_users;
	}
	
	public String saveUser(UserModel UserData) {
		user_repository.save(UserData);
		return "data saved";
	}
	
	public String updateUser(UserModel UserData,int id) {
		
		UserData.setId(id);
		
		List<UserModel> list_of_users = user_repository.findAll();
		String msg = null;

		for(int i=0;i<list_of_users.size();i++) {
			if(list_of_users.get(i).getId() == id) {
				user_repository.save(UserData);
				msg= "data updated";
				break;
			}else {
				msg= "id not found";
			}
		}
		return msg;
}
	
	public Optional<UserModel> getUser(Integer id) {
		return user_repository.findById(id) ;
	}
}
