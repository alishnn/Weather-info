package com.tsk.weatherdataservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication

@OpenAPIDefinition(info = @Info(title = "Weather Data Service", description = "This service gives live weather data of a given location"))
public class WeatherDataServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(WeatherDataServiceApplication.class, args);

	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
