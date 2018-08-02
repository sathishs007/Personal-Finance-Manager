package com.syntel.hackathon.crowdsourced.controllers;

import org.springframework.data.repository.CrudRepository;

import com.syntel.hackathon.model.Car;

public interface CrowdSourcedMongoRepository extends CrudRepository<Car,String>{}