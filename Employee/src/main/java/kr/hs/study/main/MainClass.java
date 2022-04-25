package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Employee;
import kr.hs.study.beans.Publisher;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Employee obj1 = ctx.getBean("t1", Designer.class);
		obj1.Checkin();
		Employee obj2 = ctx.getBean("t2", Designer.class);
		obj2.Checkout();
		
		Employee obj3 = ctx.getBean("t3", Developer.class);
		obj3.Checkin();
		Employee obj4 = ctx.getBean("t4", Developer.class);
		obj4.Checkout();
		
		Employee obj5 = ctx.getBean("t5", Publisher.class);
		obj5.Checkin();
		Employee obj6 = ctx.getBean("t6", Publisher.class);
		obj6.Checkout();
	}
}