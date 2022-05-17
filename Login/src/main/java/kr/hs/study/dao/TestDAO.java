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
		String sql = "insert into Login values(?, ?)";
		db.update(sql, bean.getId(), bean.getPass());
	}
	
	//update
	public void update_data(TestBean bean) {
		String sql = "update Login set id = ? where pass = ?";
		db.update(sql, bean.getId(), bean.getPass());
	}
	
	//delete
	public void delete_data(TestBean bean) {
		String sql = "delete Login where id = ?";
		db.update(sql, bean.getId());
	}
	
	//select
	public List<TestBean> select_data() {
		String sql = "select * from Login";
		List<TestBean> list = db.query(sql, mapper);
		return list;
	}
}