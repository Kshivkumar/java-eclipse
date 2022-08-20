package com.xworkz.pirates;
import com.xworkz.inheritance.parent.OnlineSuperMarket;
import com.xworkz.inheritance.chacha.Market;
import com.xworkz.inheritance.child.SuperMarket;
public class OnlineSuperMarketPirates {


	public static void main(String[] main) {
		
		Market market1 = new Market("Janata market", 25, false);
		Market market2 = new SuperMarket("major market", 45, "Ganesh");
		Market market3 = new OnlineSuperMarket("Meshoo", "Mobilecover", 200);
		market1.torisu();
		System.out.println("===============================");

		SuperMarket sm = new SuperMarket("major market", 45, "Ganesh");
		SuperMarket sm1 = new OnlineSuperMarket("Meshoo", "Mobilecover", 200);
		sm.torisu();
		System.out.println("================================");

		OnlineSuperMarket osm = new OnlineSuperMarket("Meshoo", "Mobilecover", 200);
		osm.torisu();
		System.out.println("=================================");

		if (market2 instanceof SuperMarket) {
			SuperMarket converted = (SuperMarket) market2;
			converted.torisu();
			System.out.println("ref of supermarket");
		} else {
			System.out.println("not ref of supermarket");
		}
		System.out.println("===================================");

		if (market3 instanceof OnlineSuperMarket) {
			OnlineSuperMarket converted = (OnlineSuperMarket) market3;
			converted.torisu();
			System.out.println("ref of onlinesupermarket");
		} else {
			System.out.println("not ref of onlinesupermarket");
		}
		System.out.println("====================================");

		if (market1 instanceof OnlineSuperMarket) {
			OnlineSuperMarket converted = (OnlineSuperMarket) market1;
			converted.torisu();
			System.out.println("ref of OnlineSuperMarket");
		} else {
			System.out.println("not ref of OnlineSuperMarket");
		}

	}

}
