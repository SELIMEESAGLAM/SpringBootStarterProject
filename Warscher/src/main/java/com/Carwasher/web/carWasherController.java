package com.Carwasher.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Carwasher.model.Car;
import com.Carwasher.model.Driver;

@RestController
@RequestMapping(value="/carWasherController")
public class carWasherController {

	@RequestMapping("/cars")
	public List<Car> getCars()
	{
		List<Car> cars = new ArrayList<Car>();
		Driver drivers = new Driver(1,"White","White","phone","adress");
		Driver drivers1  = new Driver(2,"White","White","phone","adress");
		Driver drivers2  = new Driver(3,"White","White","phone","adress");
		
		Car car = new Car(2,"model","color",2345);
		Car car1 = new Car(3,"model","color",2345);
		Car car2 = new Car(4,"model","color",2345);
		
		cars.add(car);
		cars.add(car1);
		cars.add(car2);
		
		return cars;
	}
	
	@RequestMapping("carNameFord")
	public ModelAndView fordTag() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name");
		modelAndView.setViewName("ford");
		return modelAndView;
	}
}
