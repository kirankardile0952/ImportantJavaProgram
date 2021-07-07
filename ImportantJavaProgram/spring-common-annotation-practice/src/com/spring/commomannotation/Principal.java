package com.spring.commomannotation;

import org.springframework.stereotype.Component;

@Component
public class Principal {

	public void principalInfo()
	{
		System.out.println("Hi i am your Principal");
		System.out.println("My name is James Bond");
	}
}
