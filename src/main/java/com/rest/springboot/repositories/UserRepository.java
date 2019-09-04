package com.rest.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rest.springboot.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel,Integer> {
	
	//getAllUsers()
	//findById()
	//delete()
	//update()
	//custom query
	//saveUser()
}
