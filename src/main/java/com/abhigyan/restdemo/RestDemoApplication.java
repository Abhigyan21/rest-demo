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

	String htmlReturnData = "<html>" +
			"<head><title>K8S Azure</title></head>" +
			"<body><h1>Welcome to K8S on Azure via SpringBoot</h1></body>" +
			"</html>";

	@GetMapping("/home")
	public String welcome() {
		return htmlReturnData;
	}
}
