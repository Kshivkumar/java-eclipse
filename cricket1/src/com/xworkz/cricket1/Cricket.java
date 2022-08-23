package com.xworkz.cricket1;

public class Cricket {
	
	public String country;
	public String captain;
	public String gender;
	
	public Cricket()
	{
		System.out.println("cricket const executed");
	}
	public boolean entertainment()
	{
		System.out.println("Cricket is game");
		return true;
	}
	public double presentation()
	{
		System.out.println("cricket is entaertainment game");
		return 0.0d;
	}
	
	public void setCountry(String country) {
		this.country=country;
		
	}
	public void setCaptain(String captain)
	{
		this.captain=captain;
		
	}
	public void setgender(String gender)
	{
		this.gender=gender;
	}
	public void torisu()
	{
		System.out.println(this.country);
		System.out.println(this.captain);
		System.out.println(this.gender);
	}

}
