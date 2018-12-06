/**
 * 
 */
package com.weather.forcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Class is used to bootstrap and launch a Weather forcast application application
 * 
 * @author Deepak Lamba
 */

@SpringBootApplication
@ComponentScan("com.weather.forcast")
public class WeatherForcastServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherForcastServiceApiApplication.class, args);
	}
}
