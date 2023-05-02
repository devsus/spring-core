package com.core.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	private static ApplicationContext context;
	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("applicationContextBeans.xml");
		Employee e = (Employee) context.getBean("employee");
		System.out.println("Id: "+e.getId());
		System.out.println("Name: "+e.getName());
	}
}