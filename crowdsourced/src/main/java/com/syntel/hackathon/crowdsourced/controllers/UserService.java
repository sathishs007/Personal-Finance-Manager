package com.syntel.hackathon.crowdsourced.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntel.hackathon.model.User;



@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;


	public boolean validateUser(User user) {
		User userDetail=userRepository.findByEmailId(user.getEmailId());
		String userName = (String) user.getEmailId();
		String password = (String) user.getPassword();
		if(userDetail==null){
			return false;
		}
		else {
			if((userName.equals(userDetail.getEmailId()) && password.equals(userDetail.getPassword()))) {
				user.setStatus("Success");
				return true;
			}
			
		}
		return false;
	}



}