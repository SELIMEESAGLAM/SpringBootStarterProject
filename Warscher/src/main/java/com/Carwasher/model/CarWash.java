package com.Carwasher.model;

import java.sql.Date;

public class CarWash {

	private int id;
	private Driver drive;
	private Car car ;
	private Date date;
	private int price;
	
	public CarWash()
	{ 
	}
	


	public CarWash(int id, Driver drive, Car car, Date date, int price) {
		super();
		this.id = id;
		this.drive = drive;
		this.car = car;
		this.date = date;
		this.price = price;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Driver getDrive() {
		return drive;
	}
	public void setDrive(Driver drive) {
		this.drive = drive;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((car == null) ? 0 : car.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((drive == null) ? 0 : drive.hashCode());
		result = prime * result + id;
		result = prime * result + price;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarWash other = (CarWash) obj;
		if (car == null) {
			if (other.car != null)
				return false;
		} else if (!car.equals(other.car))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (drive == null) {
			if (other.drive != null)
				return false;
		} else if (!drive.equals(other.drive))
			return false;
		if (id != other.id)
			return false;
		if (price != other.price)
			return false;
		return true;
	}



	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "CarWash [id=" + id + ", drive=" + drive + ", car=" + car + ", date=" + date + ", price=" + price + "]";
	}
	
	
	
}
