package com.spring.practice.autowired_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	private Heart heart;

	@Autowired
	@Qualifier("octopusHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Name of animal is : "+heart.getNameOfAnimal()+" and no of heart present : "+heart.getNoOfHeart());
		System.out.println("Setter method called");
	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
		} else {
			System.out.println("Hehehe You are Dead");
		}
	}

	public Human() {
	}

	public Human(Heart heart) {
		this.heart = heart;

		System.out.println("Human Constructor called");
	}
}
