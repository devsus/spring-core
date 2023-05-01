package com.core.depenency.java.config;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee {
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Accountant doing his work ...");

	}
}
