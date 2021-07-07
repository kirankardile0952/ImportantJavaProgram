package com.spring.value_required.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/value_required/annotation/applicationcontext.xml");
		Student student = context.getBean("student", Student.class);
		student.displayStudentInfo();
	}
}
