package com.abhigyan.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}

	@GetMapping("/home")
	public String welcome() {
		return "Welcome to Spring Boot Kubernetes!!!";
	}
}
