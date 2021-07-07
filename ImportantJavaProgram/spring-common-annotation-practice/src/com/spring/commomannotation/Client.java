package com.spring.commomannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfiguration.class);

		College college = context.getBean("college", College.class);

		college.test();

		context.close();
	}
}
