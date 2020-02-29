package com.carwacher;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "carwasher")
public class CarWasherProperties {
  private String loadTestData = "no" ;
  
  public String getloadTestData() {
	  return loadTestData;
  }
  
  public void setloadTestData(String loadTestData) {
	  this.loadTestData = loadTestData;
  }
}
