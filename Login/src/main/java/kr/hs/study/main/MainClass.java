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
		TestBean bean1 = new TestBean();
		bean1.setId("kim");
		bean1.setPass(1111);
		dao.insert_data(bean1);
		
		TestBean bean2 = new TestBean();
		bean2.setId("Lee");
		bean2.setPass(2222);
		dao.insert_data(bean2);
		
		TestBean bean3 = new TestBean();
		bean3.setId("Park");
		bean3.setPass(3333);
		dao.insert_data(bean3);
		*/
		
		/*
		//update
		TestBean bean3 = new TestBean();
		bean3.setPass(1111);
		bean3.setId("Yoon");
		dao.update_data(bean3);
		*/
		
		/*
		//delete
		TestBean bean4 = new TestBean();
		bean4.setId("Park");
		dao.delete_data(bean4);
		*/
		
		//select
		List<TestBean> list = dao.select_data();
		for(TestBean bean:list) {
			System.out.println("data1 : " + bean.getId());
			System.out.println("data2 : " + bean.getPass());
			System.out.println("------------");
		}
		
		ctx.close();
	}
}