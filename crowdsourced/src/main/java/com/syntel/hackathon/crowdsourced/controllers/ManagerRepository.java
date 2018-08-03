package com.syntel.hackathon.crowdsourced.controllers;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.syntel.hackathon.model.DeliveryDetails;
import com.syntel.hackathon.model.User;

public interface ManagerRepository extends MongoRepository<DeliveryDetails,String>{

}
