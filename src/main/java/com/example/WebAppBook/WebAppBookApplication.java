package com.example.WebAppBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class WebAppBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppBookApplication.class, args);
	}

}
