package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;
import kr.hs.study.mapper.MapperClass;

@Component
public class TestDAO {
	@Autowired
	JdbcTemplate db;
	
	@Autowired
	private MapperClass mapper;
	
	//insert
	public void insert_data(TestBean bean) {
		String sql = "insert into login values(?, ?, ?, ?)";
		db.update(sql, bean.getUserid(), bean.getUserpass(), bean.getUsername(), bean.getUserage());
	}
	
	//select
	public List<TestBean> select_data() {
		String sql = "select * from login";
		List<TestBean> list = db.query(sql, mapper);
		return list;
	}
}