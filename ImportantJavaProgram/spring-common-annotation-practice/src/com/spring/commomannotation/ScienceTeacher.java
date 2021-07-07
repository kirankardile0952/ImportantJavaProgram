package com.spring.commomannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {

		System.out.println("Hii i am your Science Teacher");
		System.out.println("My name is Takte");
	}

}
