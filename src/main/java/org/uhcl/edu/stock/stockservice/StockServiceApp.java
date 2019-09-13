package org.uhcl.edu.stock.stockservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient
public class StockServiceApp {

	public static void main(String[] args) {

		SpringApplication.run(StockServiceApp.class, args);
	}

}
