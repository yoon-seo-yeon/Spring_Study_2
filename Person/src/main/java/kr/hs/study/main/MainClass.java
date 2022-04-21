package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Person;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Person obj1 = ctx.getBean("p1", Person.class); 
		System.out.println("obj1 : " + obj1);
		
		ctx.close();
	}
}