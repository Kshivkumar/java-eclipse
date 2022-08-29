package com.xworkz.encapsule.pirates;

import com.xworkz.encapsule.Trainer;
import com.xworkz.encapsule.child.OmkarSir;
public class TrainerPirates {

	public static void main(String[] args) {

		
		Trainer train=new Trainer("Omkar",14,"full stack java");
		System.out.println("************************************");
	
		OmkarSir om=new OmkarSir("Omkar",13,"java basic");
		
		om.training();
		om.conductInterview();
		om.coding();
		System.out.println();
		System.out.println("Name of the Trainer is : "+om.getName());
		System.out.println(("Expwerience of the "+om.getName()+" is "+om.getExperience())+" years");
		System.out.println(om.getName()+" is specialised in "+om.getSpecialization());
		System.out.println("************************************");
		
		Trainer om1=new OmkarSir("Omkar",13,"java basic");
		
		
		
	}

}
