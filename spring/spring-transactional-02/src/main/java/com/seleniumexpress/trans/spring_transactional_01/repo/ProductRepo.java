package com.seleniumexpress.trans.spring_transactional_01.repo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.seleniumexpress.trans.spring_transactional_01.dto.Products;

@Repository
public class ProductRepo {

	
	private JdbcTemplate jdbcTemplate;
	
	public ProductRepo(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public void saveProduct(Products products) {
		
		String sql = "INSERT INTO PRODUCTS VALUES (?,?)";
		
		Object[] args= {products.getId(),products.getName()};
		jdbcTemplate.update(sql, args);
		

	}
}
