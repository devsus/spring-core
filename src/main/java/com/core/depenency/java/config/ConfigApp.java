package com.core.depenency.java.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DependencyConfig.class);
		Manager manager = context.getBean(Manager.class);
		manager.doWork();
		context.close();
		

	}

}
