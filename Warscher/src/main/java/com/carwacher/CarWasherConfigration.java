package com.carwacher;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarWasherConfigration {

	@Autowired
	private CarWasherProperties carWasherProperties;
	
	@PostConstruct
	public void init() {
		System.out.println("load test Data" +carWasherProperties);
	}
}
