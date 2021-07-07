package com.example.springioc;

public class Vodafone implements Sim
{
public Vodafone() {
	System.out.println("Vodafone Constructor called");
}
	@Override
	public void caling() {
		System.out.println("Calling using Vodafone Sim");
	}

	@Override
	public void data() {

		System.out.println("Browsing internet through Vodafone Sim");
	}

}
