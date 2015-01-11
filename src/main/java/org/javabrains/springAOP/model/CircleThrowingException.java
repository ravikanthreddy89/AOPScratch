package org.javabrains.springAOP.model;

import javax.management.RuntimeErrorException;

public class CircleThrowingException {

	private String name;
	
	public CircleThrowingException(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		throw new RuntimeErrorException(null, "Run time exception from Circle SetName method.");
	}
	
}
