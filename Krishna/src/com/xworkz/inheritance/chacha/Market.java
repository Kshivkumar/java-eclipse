package com.xworkz.inheritance.chacha;

public class Market {


	public String marketName;
	public int itemsAvialable;
	public boolean maintanance;


	public Market(String marketName,int itemsAvialable,boolean maintanance) {
		this.marketName = marketName;
		this.itemsAvialable = itemsAvialable;
		this.maintanance = maintanance;
		System.out.println("consturctor of Market");

	}

	public void torisu() {

		System.out.println(this.marketName);
		System.out.println(this.itemsAvialable);
		System.out.println(this.maintanance);
	}
}
