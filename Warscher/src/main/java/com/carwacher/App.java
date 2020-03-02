package com.carwacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties(value = CarWasherProperties.class)
@ComponentScan({ "com.carwacher, com.Carwasher.web"})
public class App {

	public static void main(String[] args)
	{
		SpringApplication.run(App.class, args);
	}
}
