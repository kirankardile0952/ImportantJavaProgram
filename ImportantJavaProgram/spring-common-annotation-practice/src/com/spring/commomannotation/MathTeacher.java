package com.spring.commomannotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher {

	@Override
	public void teach() {

		System.out.println("Hii i am your Math Teacher");
		System.out.println("My name is Sachin");
	}

}
