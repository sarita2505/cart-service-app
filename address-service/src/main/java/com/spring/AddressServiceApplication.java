package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class AddressServiceApplication {

	public static void main(String[] args) {
		//System.setProperty("spring.profiles.active","dev");
		SpringApplication.run(AddressServiceApplication.class, args);
	}

}
