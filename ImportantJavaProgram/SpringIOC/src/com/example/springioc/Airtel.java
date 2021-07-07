package com.example.springioc;

public class Airtel implements Sim {

	public Airtel() {
System.out.println("Airtel constructor called");
	}
	@Override
	public void caling() {

		System.out.println("Calling using Airtel Sim");
	}

	@Override
	public void data() {
		System.out.println("Browsing internet through Airtel Sim");

	}

}
