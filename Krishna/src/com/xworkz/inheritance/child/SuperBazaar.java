package com.xworkz.inheritance.child;
import  com.xworkz.inheritance.chacha.Bazaar;
public class SuperBazaar extends Bazaar {
	
	
//	String bazaarName,int itemAvailable
	public String Superbazaarname;
	public String ownerName;
	
	public SuperBazaar()
	{
		System.out.println("Inside a Default Super Bazaar Constructor");
		
	}
	
	public SuperBazaar(String bazaarName,int itemAvailable,String Superbazaarname,String ownerName)
	{
		super(bazaarName,itemAvailable);
		this.Superbazaarname=Superbazaarname;
		this.ownerName=ownerName;
		System.out.println("default constructer executed Superbazaarname");
	}
	/*public void display()
	{
		System.out.println(super.bazaarName);
		System.out.println(super.itemAvailable);
		System.out.println(this.Superbazaarname);
		System.out.println(this.ownerName);
		
		
	}*/

}
