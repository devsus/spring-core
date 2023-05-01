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
		
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = (Employee)context.getBean("manager");
		employee.doWork();
		
		
	}

}
