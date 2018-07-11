package org.dl.berlinclock.eureka.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BerlinClockEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BerlinClockEurekaServerApplication.class, args);
	}
}
