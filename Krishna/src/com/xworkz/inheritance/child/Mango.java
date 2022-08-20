package com.xworkz.inheritance.base.sup;
import com.xworkz.inheritance.subclass.Juice;
public class Mango extends Juice{
	public int price;
	public String season;
	public boolean anyTimeAvailable;
	
	public Mango(int price,String season,boolean anyTimeAvailable)
	{
		this.price=price;
		this.season=season;
		this.anyTimeAvailable=anyTimeAvailable;
	}
	public Mango()
	{
		System.out.println("int string boolean mango const executed");
	}
	public void torisu()
	{
		System.out.println(this.juiceName);
		System.out.println(this.priceOfJuice);
		System.out.println(this.typesOfJuice);
		System.out.println(this.price);
		System.out.println(this.season);
		System.out.println(this.anyTimeAvailable);
	}

}

