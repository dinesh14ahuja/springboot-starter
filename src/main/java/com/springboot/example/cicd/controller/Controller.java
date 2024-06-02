package com.springboot.example.cicd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping
	public ResponseEntity<String> HandleGet() {
		return new ResponseEntity<>("Success",HttpStatus.OK);
	}
	

}
