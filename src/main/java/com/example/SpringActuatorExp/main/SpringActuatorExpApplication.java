package com.example.SpringActuatorExp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringActuatorExpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActuatorExpApplication.class, args);
	}
	@Bean
	public RestTemplate getrestTemplate() {
		return new RestTemplate();
	}

}
