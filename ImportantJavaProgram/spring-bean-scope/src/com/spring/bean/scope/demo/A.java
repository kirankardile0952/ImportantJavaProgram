package com.spring.bean.scope.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class A {

	public A() {
		System.out.println("A Constructor");
	}
}
