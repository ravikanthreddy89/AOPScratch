package org.javabrains.springAOP.test;

import org.javabrains.springAOP.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WildCardApspectTest {

	public static void main(String [] args){
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("XML/WildCards.xml");
		
		ShapeService shapeService=beanFactory.getBean("shapeService", ShapeService.class);
		
		
		System.out.println(shapeService.getTriangle().getName());
		System.out.println(shapeService.getCircle().getName());
	}
}
