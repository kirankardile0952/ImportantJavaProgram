package com.spring.commomannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.commomannotation")
@PropertySource(value = "com/spring/commomannotation/application.properties")
public class CollegeConfiguration {

	/*
	 * @Bean public College collegeBean() { College college=new College();
	 * college.setPrincipal(principalBean()); college.setTeacher(mathTeacher());
	 * return college; }
	 * 
	 * @Bean public Principal principalBean() { return new Principal(); }
	 * 
	 * @Bean public Teacher mathTeacher() { return new MathTeacher(); }
	 */
}
