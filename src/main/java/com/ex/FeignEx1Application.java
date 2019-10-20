package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class FeignEx1Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignEx1Application.class, args);
	}

}
