
package com.example.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/example/springioc/beans.xml");
		/*
		 * Airtel air=(Airtel) context.getBean("airtel"); air.caling(); air.data();
		 */
		/*
		 * Vodafone voda=context.getBean("vodafone",Vodafone.class); voda.caling();
		 * voda.data();
		 */
		Sim sim=(Sim) context.getBean("sim");
		sim.caling();
		sim.data();
	}
}
