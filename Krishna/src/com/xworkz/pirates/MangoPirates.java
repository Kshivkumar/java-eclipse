package com.xworkz.pirates;
import com.xworkz.inheritance.base.sup.Mango;
import com.xworkz.inheritance.subclass.Juice;
public class MangoPirates {

	public static void main(String[] args) {
		
		Mango mango=new Mango();
		mango.juiceName="mango flavoured juice";
		mango.priceOfJuice=120;
		mango.typesOfJuice=12;
		mango.price=80;
		mango.season="summer";
		mango.anyTimeAvailable=false;
		
		mango.torisu();
		
		Juice juice=new Mango();
		juice.juiceName="mango flavoured juice";
		juice.priceOfJuice=120;
		juice.typesOfJuice=12;
		
		Juice convertedfromparenttochild=(Juice) mango;
		//type  casting
		//convertedfromparenttochild.torisu();
		

	}

}
