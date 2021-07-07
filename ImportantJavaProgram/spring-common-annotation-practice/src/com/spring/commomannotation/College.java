package com.spring.commomannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Value("${College.collegeName}")
	private String collegeName;
	
	@Autowired
	private Principal principal;

	@Autowired
	private Teacher teacher;

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("My College Name is "+collegeName);
		System.out.println("Testing this method");

	}

}
