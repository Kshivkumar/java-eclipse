package com.xworkz.abstracti.pirates;

import com.xworkz.abstracti.prepaid.Prepaid;
import com.xworkz.abstracti.simcard.SimCard;
import com.xworkz.abstracti.prepaid.PostPaid;
public class SimPirates {

	public void main(String [] args)
	{
		SimCard pre=new Prepaid();
		pre.callService();
		pre.checkBalance();
		pre.mms();
		pre.smsService();
		
		SimCard post=new PostPaid();
		post.callService();
		post.checkBalance();
		post.mms();
		post.smsService();
		
		
		
	}

}
