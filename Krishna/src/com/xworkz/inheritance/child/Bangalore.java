package com.xworkz.inheritance.child;

public class Bangalore {
	String cityName;
	double population;
	double areaInsqrtfeet;
	Banglore(String state,String chiefMinister, String capitalCity,String cityName,double population,double areaInsqrtfeet){
		super(state,chiefMinister,capitalCity);
		this.cityName=cityName;
		this.population=population;
		this.areaInsqrtfeet=areaInsqrtfeet;
		
	}
	void torisu() {
		System.out.println(super.state);
		System.out.println(super.chiefMinister);
		System.out.println(super.capitalCity);
		System.out.println(this.state);
		System.out.println(this.chiefMinister);
		System.out.println(this.capitalCity);
		System.out.println(this.cityName);
		System.out.println(this.population);
		System.out.println(this.areaInsqrtfeet);

	}

}
