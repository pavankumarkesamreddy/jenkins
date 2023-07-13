package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;


@SpringBootApplication
public class DemoApplication {

	
	public static Logger ls = LoggerFactory.getLogger(DemoApplication.class);
	
	@PostConstruct
	public void intt() {
		ls.info("application startup before");
	}
	
	public static void main(String[] args) {
		ls.info("application startup ");
		SpringApplication.run(DemoApplication.class, args);
	}

}
