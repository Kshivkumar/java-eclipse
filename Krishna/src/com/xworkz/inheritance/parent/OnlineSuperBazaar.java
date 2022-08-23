package com.xworkz.inheritance.parent;

import com.xworkz.inheritance.child.SuperBazaar;
public class OnlineSuperBazaar extends SuperBazaar {
	
	public String onlineSuperBazaarName;
	public int noOfWorkers;
	
	
	public OnlineSuperBazaar()
	{
		System.out.println("Inside a Default OnlineSuperBazaar Constructor");
		
	}
	public OnlineSuperBazaar(String bazaarName,int itemAvailable,String Superbazaarname,String ownerName,String onlineSuperBazaarName,int noOfWorkers)
	{
	   super.bazaarName=bazaarName;
	   super.itemAvailable=itemAvailable;
	   super.Superbazaarname=Superbazaarname;
	   super.ownerName=ownerName;
		this.onlineSuperBazaarName=onlineSuperBazaarName;
		this.noOfWorkers=noOfWorkers;
		System.out.println("OnlineSuperBazaar constructed executed");
	}
	public void display()
	{
		System.out.println(super.bazaarName);
		System.out.println(super.itemAvailable);
		System.out.println(super.Superbazaarname);
		System.out.println(super.ownerName);
		System.out.println(this.onlineSuperBazaarName);
		System.out.println(this.noOfWorkers);
	
		
	}

}
