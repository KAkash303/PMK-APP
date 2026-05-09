package com.pmk.pmkApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmk.pmkApp.model.Test;
import com.pmk.pmkApp.repo.TestRepository;


@RestController
@RequestMapping("/pmk")
public class PmkAppController {
	
	@Autowired
	TestRepository testRepository;

    @GetMapping("/test")
    public String test() {
        return "Success: Spring Boot is running 🚀";
    }
    
    
    @GetMapping("/get/testData")
    public List<Test> getAllData() {
        return testRepository.findAll();
    }
    
    
    
    
	
}
