package com.rahul.MyAspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("dummy()")
	public void loggingAdvice(JoinPoint obj)
	{
		System.out.println("Advice printed before method.");
		System.out.println("name of object is "+obj.toString());
	}
	
	/*wildcards *-for all
	 * .. - for 0 or more args
	 * @Pointcut() have dummy method
	 * refer pointcut from annotation
	*/
	
	@Pointcut("execution(* get*(..))")		
	public void dummy() {}
}
