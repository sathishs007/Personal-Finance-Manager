package com.syntel.hackathon.crowdsourced.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






import com.google.gson.Gson;
import com.syntel.hackathon.model.User;


@RestController
@CrossOrigin(origins = { "*" })
@RequestMapping("lastmiledelivery")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("validate")
	public ResponseEntity<User> validateUser(@RequestBody User user) {       
		Boolean validUser= userService.validateUser(user);
		if(validUser)			
			return new ResponseEntity<User>(user, HttpStatus.CREATED);
		else
			return new ResponseEntity<User>(HttpStatus.CONFLICT);
	}
	
	@PostMapping("saveUser")
	public ResponseEntity saveUser(@RequestBody User user) {		
		System.out.println("************** In save *****************");	
		userRepository.save(user);
		return new ResponseEntity(HttpStatus.OK);
	}
	
    @RequestMapping(value = "/Dashboard", method = RequestMethod.GET)
    public String Dashboard(Model model) {
    	System.out.println("welcome");
        model.addAttribute("usersList", userRepository.findAll());
        return "redirect:Dashboard";
    }
	
}
