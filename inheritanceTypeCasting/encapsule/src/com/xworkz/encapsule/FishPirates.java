
package com.xworkz.encapsule;

public class FishPirates {

			public static void main(String[] args) {

				Fish fish = new Fish("Tiger Bomb", "Fresh water");

				System.out.println(fish);
				String ab1 = fish.getName();
				String ab2 = fish.getType();
				System.out.println(ab1);
				System.out.println(ab2);

				System.out.println("**********");
				Fish fish2 = new Fish("Tiger ", "Fresh water");

				boolean ju = fish.equals(fish2);
				System.out.println(ju);

			
			
			}
}






