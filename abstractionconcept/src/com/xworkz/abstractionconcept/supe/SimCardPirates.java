package com.xworkz.abstractionconcept.supe;

import com.xworkz.abstarctionconcept.pirates.SimCard1;
import com.xworkz.abstractionconcept.sub.PostPaid;
import com.xworkz.abstractionconcept.sub.PrePaid;

public class SimCardPirates {
 
	public static void main (String [] args)
	{
		
		
	SimCard1 sim=new PostPaid();
	sim.checkbalance();
	sim.mms();
	sim.network();
	sim.Sms();
	
	SimCard1 post=new PrePaid ();
	PrePaid pp=(PrePaid)post;
	pp.checkbalance();
	pp.mms();
	pp.Sms();
	pp.network();
	
	PrePaid pre=new PrePaid();
	pre.checkbalance();
	pre.mms();
	pre.Sms();
	pre.network();
	
	
	pre.display();
	
	
	
	
	
	}
	
}
