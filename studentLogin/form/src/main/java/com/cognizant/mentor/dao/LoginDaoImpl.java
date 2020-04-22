package com.cognizant.caseStudy.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cognizant.caseStudy.modal.User;

@Repository
@Qualifier("loginDao")
public class LoginDaoImpl implements LoginDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public User getUser(String name) {
		try{
			return jdbcTemplate.queryForObject("SELECT * FROM users WHERE user_name=?", new Object[] {name},
					new RowMapper<User>() {
						public User mapRow(ResultSet rs, int rowNum) throws SQLException {
							return new User(rs.getInt("user_id"), rs.getString("user_name"), rs.getString("user_password"));
						}
					});
		}
		catch(EmptyResultDataAccessException e) {
			return null;
		}
	}

}
