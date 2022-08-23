package com.xworkz.cricket1;

public class T20Cricket extends Cricket {

	public T20Cricket()
	{
		System.out.println("t20cricket default constructer executed");
	}
	public T20Cricket(String country,String captain,String gender)
	{
		super.country=country;
		super.captain=captain;
		super.gender=gender;
	}
	

	public String manOfTheMatch()
	{
		System.out.println("man of the match given to player,who perform well in the match");
		return "M.S dhoni";
	}
	public boolean entertainment()
	{
		System.out.println("most liked game in the india");
		return true;
	}
	public void torisu()
	{
		System.out.println(super.country);
		System.out.println(super.captain);
		System.out.println(super.gender);
	}
	
}