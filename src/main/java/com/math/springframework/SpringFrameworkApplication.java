package com.math.springframework;

import com.math.springframework.controllers.ConstructorInjector;
import com.math.springframework.controllers.PropertyInjector;
import com.math.springframework.controllers.SetterInjector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringFrameworkApplication.class, args);

//		MyController myController = (MyController) ctx.getBean("myController");
//
//		System.out.println(myController.getGreeting());

		PropertyInjector propertyInjected = (PropertyInjector) ctx.getBean("propertyInjector");

		System.out.println(propertyInjected.getGreeting());

		System.out.println("-------Setter---------");

		SetterInjector setterInjector = (SetterInjector) ctx.getBean("setterInjector");

		System.out.println(setterInjector.getGreeting());

		System.out.println("-------Constructor---------");

		ConstructorInjector constructorInjector = (ConstructorInjector) ctx.getBean("constructorInjector");

		System.out.println(constructorInjector.getGreeting());
	}

}
