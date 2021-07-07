package com.spring.bean.scope.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class D {
	public D() {
		System.out.println("D Constructor");
	}
}
