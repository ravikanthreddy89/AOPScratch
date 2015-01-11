package org.javabrains.springAOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCut {

	@Before("getters()")
	public void getterLogger(){
		
		System.out.println("GetterLogger.");
	}
	
	@Pointcut("execution(public * get*())")// Note :works for getName() and getTriangle() and getCircle()
	public void getters(){
		
	}
}
