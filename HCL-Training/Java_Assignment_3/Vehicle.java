package com.hcl.assignments;

class Vehicle {
	public int vehicleNumber;
	public String model;
	public String manufacturer;
	public String color;
	this.color = color;
		

}

class Truck extends Vehicle {
	double loadingCapacity;
	
public Truck(double loadingCapacity, String color) {
	super(color);
	this.loadingCapacity=loadingCapacity;
	
}
	
	
}

}
