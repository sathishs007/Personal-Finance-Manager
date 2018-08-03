package com.syntel.hackathon.crowdsourced.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.syntel.hackathon.model.Car;

@Controller
public class CarController {

    @Autowired
    CrowdSourcedMongoRepository carRepository;

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
    
    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("carList", carRepository.findAll());
        return "home";
    }

    @RequestMapping(value = "/addCar", method = RequestMethod.POST)
    public String addCar(@ModelAttribute Car car) {
        carRepository.save(car);
        return "redirect:home";
    }

    @RequestMapping(value = "/search")
    public String search(@RequestParam String search) {
        return "home";
    }

}