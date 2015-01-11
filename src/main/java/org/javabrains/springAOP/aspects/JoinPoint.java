package org.javabrains.springAOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class JoinPoint {

	@Before("getters()")
	public void adviceUsingPointCut(org.aspectj.lang.JoinPoint joinPoint){
		System.out.println("Advice using PointCut.");
		System.out.println(joinPoint.toString());
	}

	@Pointcut("within(org.javabrains.springAOP.model.Circle)")
	public void getters(){
		
	}
}
