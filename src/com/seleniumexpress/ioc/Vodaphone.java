package com.seleniumexpress.ioc;

public class Vodaphone implements Sim {

	@Override
	public void calling() {
		// TODO Auto-generated method stub

		System.out.println("Calling using vodaphone mobile");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("browsing internet using vodaphone sim");
		
	}

}
