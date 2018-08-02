package com.syntel.hackathon.crowdsourced.controllers;

import org.springframework.data.repository.CrudRepository;

import com.syntel.hackathon.model.User;

public interface UserRepository extends CrudRepository<User,String>{
	
	public User findByEmailId(String emailid);

}
