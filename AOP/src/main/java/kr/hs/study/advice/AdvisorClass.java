package kr.hs.study.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("beforeMethod ȣ��");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod ȣ��");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMethod ȣ��1");
		pjp.proceed();
		System.out.println("arountMethod ȣ��2");
	}
	
	public void afterThrowing(Throwable e) {
		System.out.println("afterThrowing ȣ��");
	}
	
	public void afterReturning() {
		System.out.println("afterReturning ȣ��");
	}
}