package com.xworkz.abstractionconcept.sub;

import com.xworkz.abstarctionconcept.pirates.SimCard1;

public class PostPaid extends SimCard1{

	@Override
	public void checkbalance() {
		System.out.println("not available");
	}

	@Override
	public void Sms() {
		System.out.println("not available");
	}

	@Override
	public void network() {
		System.out.println("not available");
	}

	@Override
	public void mms() {
		System.out.println("not available");
	}

}
