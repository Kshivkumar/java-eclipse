package com.xworkz.cricket1;

public class TestCricket extends Cricket {
	public String groundType;
	
	public TestCricket()
	{
		System.out.println("test cricket default constructer executed");
	}
	
	public TestCricket(String country,String captain,String gender)
	{
		super.country=country;
		super.captain=captain;
		super.gender=gender;
	}
	@Override   //Annotation
	public double presentation()
	{
		System.out.println("cricket is origin from england");
		return 0.0d;
	}
	public void setGroundType(String groundType) {
		this.groundType = groundType;
	}
	
	public void torisu()
	{
		System.out.println(super.country);
		System.out.println(super.captain);
		System.out.println(super.gender);
		System.out.println(this.groundType);
		
	}
	
}
