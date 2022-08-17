package com.xworkz.inheritance;

public class Train {
	public String metroName;
	public double metroPrice;
	public int metroNumber;
	public String StationName;
	public int noOfStation;
	
	public Train() {
		
	}

	public Train(String metroName, double metroPrice, int metroNumber, String StationName, int noOfStation) {

		this.metroName = metroName;
		this.metroPrice = metroPrice;
		this.metroNumber = metroNumber;
		this.StationName = StationName;
		this.noOfStation = noOfStation;

	}

	public void torisu() {
		System.out.println(this.metroName);
		System.out.println(this.metroPrice);
		System.out.println(this.metroNumber);
		System.out.println(this.StationName);
		System.out.println(this.noOfStation);
	}
}
