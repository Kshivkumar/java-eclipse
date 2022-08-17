package com.xworkz.inheritance;

public class Plane {
	public String name = "Air India";
	public int noOfseats = 6;
	public double ticketPrice = 5464;
	public double helicopterWeight = 350;
	public int wings = 4;
	
	
public Plane() {
	// TODO Auto-generated constructor stub
	System.out.println("plane constructer executed");
	
}
public void torisu()
{
	System.out.println(this.name);
	System.out.println(this.noOfseats);
	System.out.println(this.ticketPrice);
	System.out.println(this.helicopterWeight);
	System.out.println(this.wings);
}


}
