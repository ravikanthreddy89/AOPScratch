package org.javabrains.springAOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class WildCardAspects {

	@Before("execution(public String get*())")
	public void getterAdvice(){
		System.out.println("Getter Advice invoked");
	}
}
