package com.rcmutha.jdbctemplatetest;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Customer customer=new Customer(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"));
		return customer;
	}

}
