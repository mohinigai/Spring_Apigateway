package com.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApigatewayApplication.class, args);
	}

}
