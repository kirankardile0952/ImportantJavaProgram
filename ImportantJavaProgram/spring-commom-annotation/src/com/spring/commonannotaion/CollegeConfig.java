package com.spring.commonannotaion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.commonannotaion")
public class CollegeConfig {
	@Bean
	public College collegeBean() {
		College college=new College();
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacherBean());
		return college;
	}
	
	public Principal principalBean()
	{
		return new Principal();
	}
	
	@Bean
	public Teacher mathTeacherBean()
	{
		return new MathTeacher();	
	}
}
