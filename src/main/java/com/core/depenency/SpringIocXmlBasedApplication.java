package com.core.depenency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringIocXmlBasedApplication {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(SpringIocXmlBasedApplication.class, args);
		
		//applicationContextAnnotation.xml
		//applicationContextAnnotation.xml
		context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
		com.core.xml.annotation.depenency.Employee employee = (com.core.xml.annotation.depenency.Employee)context.getBean("manager");
		employee.doWork();
		
		
	}

}
