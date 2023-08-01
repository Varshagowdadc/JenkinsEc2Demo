package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class JenkinsEc2DemoApplication {
	@GetMapping("/")
	@ResponseBody 
	public String demo() {
	
	return "hello";
	
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsEc2DemoApplication.class, args);
	}

}
