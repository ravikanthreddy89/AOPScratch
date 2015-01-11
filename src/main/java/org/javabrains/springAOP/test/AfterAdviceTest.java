package org.javabrains.springAOP.test;

import org.javabrains.springAOP.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AfterAdviceTest {

	public static void main(String [] args){
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("XML/AfterAdvice.xml");
		
		ShapeService shapeService=beanFactory.getBean("shapeService", ShapeService.class);
		shapeService.getCircle().getName();
		shapeService.getCircle().setName("Some dummy circle name.");
	}
}
