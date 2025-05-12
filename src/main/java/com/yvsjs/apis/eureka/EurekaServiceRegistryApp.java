package com.yvsjs.apis.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceRegistryApp {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceRegistryApp.class, args);
	}

}
