package org.javabrains.springAOP.service;

import org.javabrains.springAOP.model.Circle;
import org.javabrains.springAOP.model.Triangle;

public class ShapeService {

	private Triangle triangle;
	private Circle circle;
	
	public ShapeService(){
		
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	
}
