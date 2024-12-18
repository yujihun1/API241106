package com.example.api20241106;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Api20241106Application {

	public static void main(String[] args) {
		SpringApplication.run(Api20241106Application.class, args);
	}

}
