package com.core.xml.annotation.depenency;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee {
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Accountant doing his work ...");

	}
}
