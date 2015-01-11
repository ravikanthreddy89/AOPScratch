package org.javabrains.springAOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;

@Aspect
public class LoggerAspect {

	@Before("execution(public String getName())")
	public void getAdvice(){
		System.out.println("Logging method invoked.");
	}
}
