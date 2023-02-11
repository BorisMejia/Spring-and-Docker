package com.example.Docker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {
	
	@GetMapping("/Hello")
	public ResponseEntity<String>getHelloDocker(){
		return ResponseEntity.ok("Welcome to the use Docker");
	}

}
