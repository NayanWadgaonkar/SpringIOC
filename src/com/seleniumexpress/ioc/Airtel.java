package com.seleniumexpress.ioc;

public class Airtel implements Sim {

	public Airtel() {
		System.out.println("airtel constructor is called");
	}
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling using airtel mobile");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub

		System.out.println("browsing internet using airtel sim");
		
	}

}
