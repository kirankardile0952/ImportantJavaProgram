package com.example.springioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {
//		byUsingBeanFactory();
		byUsingApplicationContext();

	}

	private static void byUsingApplicationContext() {
		System.out.println(".....Object Managed by ApplicationContext.......");

		Resource resource = new ClassPathResource("com/example/springioc/applicationcontext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Employee emp = (Employee) beanFactory.getBean("emp");
		emp.getEmployeeDetails();

	}

	private static void byUsingBeanFactory() {
		System.out.println("........Object Managed by Bean Factory.......");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/springioc/applicationcontext.xml");
		Employee emp = (Employee) context.getBean("emp");
		emp.getEmployeeDetails();
	}

}
