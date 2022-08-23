package com.xworkz.cricket1;

public class CricketPirates {

	public static void main (String [] args)
	{
		
		Cricket cricket=new Cricket();
		cricket.setCountry("Australia");
		cricket.setCaptain("Andry Murray");
		cricket.setgender("Male");
		boolean crk=cricket.entertainment();
		System.out.println(crk);
		double kjh=cricket.presentation();
		System.out.println(kjh);
		cricket.torisu();
		
		TestCricket tcricket=new TestCricket("india","dhoni","male");
		tcricket.setGroundType("open grounded");
		double tst=tcricket.presentation();
		System.out.println(tst);
		tcricket.torisu();
		
		OneDayCricket ondcric=new OneDayCricket("England","buttler","male","david willey","josh buttler");
		String ond=ondcric.manOfSeries();
		System.out.println(ond);
		double ond1=ondcric.presentation();
		System.out.println(ond1);
		boolean ond2=ondcric.entertainment();
		System.out.println(ond2);
		ondcric.torisu();
		
		T20Cricket t20=new T20Cricket("india","harma preetsingh","female");
		String t=t20.manOfTheMatch();
		System.out.println(t);
		boolean t2=t20.entertainment();
		System.out.println(t2);
		t20.torisu();
	}
}
