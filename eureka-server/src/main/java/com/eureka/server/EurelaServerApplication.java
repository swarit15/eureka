package com.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableEurekaServer
@SpringBootApplication
@EnableAdminServer
public class EurelaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurelaServerApplication.class, args);
	}
}
