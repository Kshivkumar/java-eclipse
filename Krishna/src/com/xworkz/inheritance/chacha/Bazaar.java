package com.xworkz.inheritance.chacha;

public class Bazaar {

	public String bazaarName;
	public int itemAvailable;
	
	public Bazaar()
	{
		System.out.println("Inside a Default Bazaar Constructor");
		
	}
	
	public Bazaar(String bazaarName,int itemAvailable)
	{
		this.bazaarName=bazaarName;
		this.itemAvailable=itemAvailable;
		System.out.println("constructer of bazaar executed");
	}
	/*public void display()
	{
		System.out.println(this.bazaarName);
		System.out.println(this.itemAvailable);
	}*/
}
