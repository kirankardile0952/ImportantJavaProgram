package com.example.springioc;

public class Jio implements Sim {

	public Jio() {
System.out.println("Jio constructor called");
	}
	@Override
	public void caling() {

		System.out.println("Calling using Jio Sim");
	}

	@Override
	public void data() {
		System.out.println("Browsing internet through Jio Sim");

	}

}
