package com.spring.value_required.annotation;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("Pinki")
	private String name;

	@Value("${Student.intrestedCourse}")
	private String intrestedCourse;

	@Value("${Student.hobby}")
	private String hobby;

	public void displayStudentInfo() {
		System.out.println("Student Name : " + name);
		System.out.println("Student intrested course : " + intrestedCourse);
		System.out.println("Student hobby : " + hobby);
	}

}
