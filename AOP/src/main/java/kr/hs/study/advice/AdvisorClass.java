package kr.hs.study.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMethod 호출1");
		pjp.proceed();
		System.out.println("arountMethod 호출2");
	}
	
	public void afterThrowing(Throwable e) {
		System.out.println("afterThrowing 호출");
	}
	
	public void afterReturning() {
		System.out.println("afterReturning 호출");
	}
}