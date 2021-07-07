package com.spring.commonannotaion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class College {

	public Principal principal;

	public Teacher teacher;

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void test() {
		principal.principalInfo();
		System.out.println("Method has been called which we have taken for an testing purpose");
		teacher.teach();
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("using setPrincipal");
	}
}
