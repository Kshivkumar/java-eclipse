package com.xworkz.pirates;

import  com.xworkz.inheritance.chacha.Bazaar;
import com.xworkz.inheritance.child.SuperBazaar;
import com.xworkz.inheritance.parent.OnlineSuperBazaar;

public class BazaarPirates {

	
	public static void main(String [] args)
	{
		Bazaar baz=new Bazaar("Sasta Bazaar",78);
	
		
		SuperBazaar supBaz=new SuperBazaar("Jio Mart",89,"Vishal Mart","Basu");
      Bazaar baz2=new SuperBazaar("D Mart",89,"Vishal Mart","Basu");
		
		
		
		OnlineSuperBazaar onlSupBaz=new OnlineSuperBazaar("Amazon Mart",89,"Kushal Mart","Shiva","Flipkart",93);
		onlSupBaz.display();
		
		SuperBazaar supBaz2=new OnlineSuperBazaar("Flipkart Mart",89,"Kushal Mart","Shiva","Flipkart",93);
		
		Bazaar baz3=new OnlineSuperBazaar("Shopclue",89,"Kushal Mart","Shiva","Flipkart",93);
				if (baz3 instanceof OnlineSuperBazaar)
				{
					OnlineSuperBazaar converted=(OnlineSuperBazaar)baz3;
					System.out.println("ref is pointing");
					converted.display();
				}
				else
				{
					System.out.println("ref is not pointing");
				}
				
				if (supBaz2 instanceof OnlineSuperBazaar)
				{
					OnlineSuperBazaar convert=(OnlineSuperBazaar)supBaz2;
					System.out.println("ref is pointing");
					convert.display();
				}
				else
				{
					System.out.println("ref is not pointing");
				}
		
		
		
		
		
	}
	
}
