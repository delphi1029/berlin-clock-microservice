package com.weather.forcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.weather.forcast")
public class WeatherForcastServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherForcastServiceApiApplication.class, args);
	}
}
