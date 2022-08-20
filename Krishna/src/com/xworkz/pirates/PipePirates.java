package com.xworkz.pirates;
import com.xworkz.inheritance.child.Pipe;
import com.xworkz.inheritance.parent.Plastic;
public class PipePirates {

public static void main(String[] args) {
		
		Pipe pipe = new Pipe();
		
		pipe.name = "Pipe";
		pipe.brand = "Finolex";
		pipe.advantage = "Lite Weight";
		pipe.strength = "Good";
		pipe.gravity = "Low";
		pipe.price = "Cheap";
		
		pipe.torisu();
		
		Plastic plastic = new Pipe();
		
		plastic.name = "Pipe";
		plastic.brand = "Finolex";
		plastic.advantage = "Lite Weight";
		
		Pipe ConvertedFromPlastic = (Pipe)plastic;
		// type casting
		ConvertedFromPlastic.torisu();

	}

}

