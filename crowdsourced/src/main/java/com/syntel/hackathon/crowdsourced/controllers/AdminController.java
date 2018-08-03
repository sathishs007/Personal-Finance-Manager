package com.syntel.hackathon.crowdsourced.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.syntel.hackathon.model.DeliveryDetails;
import com.syntel.hackathon.model.User;

@RestController
@CrossOrigin(origins = { "*" })
public class AdminController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/viewUserDetails", method = RequestMethod.GET)
	public ResponseEntity<List<User>> viewUserDetails() {
		List<User> userDetails = (List<User>) userRepository.findAll();
		return new ResponseEntity<List<User>>(userDetails, HttpStatus.OK);
	}

}
