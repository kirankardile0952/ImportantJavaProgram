package com.spring.bean.scope.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class C {
	public C() {
		System.out.println("C Constructor");
	}
}
