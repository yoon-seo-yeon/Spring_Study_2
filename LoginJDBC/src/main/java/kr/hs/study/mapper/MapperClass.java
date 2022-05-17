package kr.hs.study.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class MapperClass implements RowMapper {
	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		TestBean bean = new TestBean();
		bean.setUserid(rs.getString("userid"));
		bean.setUserpass(rs.getInt("userpass"));
		bean.setUsername(rs.getString("username"));
		bean.setUserage(rs.getInt("userage"));
		
		return bean;
	}
}
