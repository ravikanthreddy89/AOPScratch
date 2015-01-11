package org.javabrains.springAOP.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterAdvice {

	// Configure an advice that gets exectuted when a getter is called
	@After("execution(* get*())")
	public void getterAdvice(){
		System.out.println("Getter advice is called.");
	}
	
	// Note the "pointcut" can only be given to AfterReturning not to After.
	@AfterReturning(pointcut="args(name)")
	public void setterWithString(String name){
		System.out.println("Setter with string as args called . Args : "+name);
	}
	
	// Advice called when an error is thrown
	@AfterThrowing(pointcut="args(name)", throwing="someException")
	public void exceptionCatcherAdvice(String name,Exception e){
		System.out.println("Exception thrown is : "+e);
	}
}
