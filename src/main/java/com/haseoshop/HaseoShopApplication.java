package com.haseoshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class HaseoShopApplication {

	public static void main(String[] args) {
//		System.getProperty("server.port");
		SpringApplication.run(HaseoShopApplication.class, args);
	}
	
}
