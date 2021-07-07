package com.spring.bean.scope.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prototypeDemo")
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope("prototype")
public class PrototypeDemo {

	public PrototypeDemo() {
	System.out.println("Prototype Constructor Called");
	}
}
