package com.core.depenency.java.config;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee{
     @Override
    public void doWork() {
    	// TODO Auto-generated method stub
    	 System.out.println("Manager managing offices ...");
    	
    }
}
