package org.dl.berlinclock.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableFeignClients("org.dl.berlinclock.client")
@ComponentScan("org.dl.berlinclock")
public class BerlinClockDisplayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BerlinClockDisplayServiceApplication.class, args);
	}
}
