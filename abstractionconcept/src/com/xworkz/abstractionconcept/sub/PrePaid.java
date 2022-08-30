package com.xworkz.abstractionconcept.sub;

import com.xworkz.abstarctionconcept.pirates.SimCard1;

public class PrePaid extends SimCard1 {

	@Override
	public void checkbalance() {
		System.out.println("available");
	}

	@Override
	public void Sms() {
		System.out.println("available");
	}

	@Override
	public void network() {
		System.out.println("available");
	}

	@Override
	public void mms() {
		System.out.println("available");
	}
	public void display()
	{
		System.out.println("==============");
	}

}
