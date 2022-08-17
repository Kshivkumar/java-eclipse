package com.xworkz.inheritance;

public class Cycle extends Bike {
 
	public Cycle(String bikeName,String bikeOwner,int noOfWheels,int bikeModel,boolean isItElectricBike) {
		
		this.bikeName = bikeName;
		this.bikeOwner = bikeOwner;
		this.noOfWheels = noOfWheels;
		this.bikeModel = bikeModel;
		this.isItElectricBike = isItElectricBike;

	}
}
