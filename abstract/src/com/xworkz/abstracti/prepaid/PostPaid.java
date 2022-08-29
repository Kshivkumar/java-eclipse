package com.xworkz.abstracti.prepaid;

import com.xworkz.abstracti.simcard.SimCard;

public class PostPaid extends SimCard {

	@Override
	public void checkBalance() {
		System.out.println("in postpaid checking balance service not available");
	}

	@Override
	public void smsService() {
		System.out.println("In postpaid sms service not available");
	}

	@Override
	public void callService() {
		System.out.println("in postpaid limited call service available");
	}

	@Override
	public void mms() {
		System.out.println("in postpaid mms service available");
	}

	
}
