package com.demo.APIgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayUberApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayUberApplication.class, args);
	}

}
