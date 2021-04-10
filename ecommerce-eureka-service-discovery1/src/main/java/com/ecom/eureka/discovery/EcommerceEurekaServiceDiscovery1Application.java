package com.ecom.eureka.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EcommerceEurekaServiceDiscovery1Application {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceEurekaServiceDiscovery1Application.class, args);
	}

}
