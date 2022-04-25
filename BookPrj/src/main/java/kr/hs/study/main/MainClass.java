package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;
import kr.hs.study.beans.Book;
import kr.hs.study.beans.Magazine;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Book obj1 = ctx.getBean("t1", Novel.class);
		obj1.buy();
		
		Book obj2 = ctx.getBean("t2", Poet.class);
		obj2.buy();
		
		Book obj3 = ctx.getBean("t3", Magazine.class);
		obj3.buy();
		
		ctx.close();
	}
}