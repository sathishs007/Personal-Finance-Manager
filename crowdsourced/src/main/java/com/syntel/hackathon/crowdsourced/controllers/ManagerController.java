package com.syntel.hackathon.crowdsourced.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.syntel.hackathon.model.DeliveryDetails;

@RestController
public class ManagerController {

	// @Autowired
	// private ManagerService managerService;
	//
	@Autowired
	private ManagerRepository managerRepository;

	@RequestMapping(value = "/saveDeliveryDetails", method = RequestMethod.POST)
	public ResponseEntity saveDeliveryDetails(@RequestBody DeliveryDetails deliveryDetails) {

		managerRepository.save(deliveryDetails);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/updateDeliveryDetails", method = RequestMethod.PUT)
	public ResponseEntity updateDeliveryDetails(@RequestBody DeliveryDetails deliveryDetails) {

		managerRepository.save(deliveryDetails);
		return new ResponseEntity(HttpStatus.OK);
	}

	/* Find all deliverydetails */
	@RequestMapping(value = "/viewDeliveryDetails", method = RequestMethod.GET)
	public ResponseEntity<List<DeliveryDetails>> viewDeliveryDetails() {
		List<DeliveryDetails> deliveryDetails = managerRepository.findAll();
		return new ResponseEntity<List<DeliveryDetails>>(deliveryDetails, HttpStatus.OK);
	}
}
