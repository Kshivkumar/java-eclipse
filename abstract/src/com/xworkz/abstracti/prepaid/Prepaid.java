package com.xworkz.abstracti.prepaid;

import com.xworkz.abstracti.simcard.SimCard;

public class Prepaid extends SimCard{

	@Override
	public void checkBalance() {
		System.out.println("checking  balance service available");
	}

	@Override
	public void smsService() {
		System.out.println("sms service available");
	}

	@Override
	public void callService() {
		System.out.println("call servie available");
	}

	@Override
	public void mms() {
		System.out.println("mms service not available");
	}
	

}
