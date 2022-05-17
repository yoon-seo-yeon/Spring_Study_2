package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.BeanConfigClass;
import kr.hs.study.beans.TestBean;
import kr.hs.study.dao.TestDAO;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
	
		TestDAO dao = ctx.getBean(TestDAO.class);
		
		/*
		//insert
		TestBean bean = new TestBean();
		bean.setUserid("yoon");
		bean.setUserpass(14);
		bean.setUsername("À±¼­¿¬");
		bean.setUserage(19);
		dao.insert_data(bean);
		*/
		
		//select
		List<TestBean> list = dao.select_data();
		for(TestBean bean:list) {
			System.out.println("userid : " + bean.getUserid());
			System.out.println("userpass : " + bean.getUserpass());
			System.out.println("username : " + bean.getUsername());
			System.out.println("userage : " + bean.getUserage());
		}
		
		ctx.close();
	}
}