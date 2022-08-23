package com.xworkz.cricket1;

public class OneDayCricket extends Cricket  {

	public String bestBowler;
	public String bestBatsman;
	
	public OneDayCricket()
	{
		System.out.println("oneday cricket default constructer executed");
	}
	public OneDayCricket(String country,String captain,String gender,String bestBowler,String bestBatsman)
	{
		super.country=country;
		super.captain=captain;
		super.gender=gender;
		this.bestBatsman=bestBatsman;
		this.bestBowler=bestBowler;
	}
	public String manOfSeries()
	{
		System.out.println("oneday cricket played one day match");
		return "Mahendra Singh Dhoni";
	}
	@Override 
	public double presentation()
	{
		System.out.println("cricket is entaertainment game");
		return 0.1d;
	}
	@Override
	public boolean entertainment()
	{
		System.out.println("oneday cricket most disliked game ");
		return true;
	}
	
		public void setbestBowler(String bestBowler)
		{
		  this.bestBowler=bestBowler;
		} 
	public void setbestBatsman(String bestBatsman)
	{
		this.bestBatsman=bestBatsman;
	}
	public void torisu()
	{
		System.out.println(super.country);
		System.out.println(super.captain);
		System.out.println(super.gender);
		System.out.println(this.bestBowler);
		System.out.println(this.bestBatsman);
	}
}
