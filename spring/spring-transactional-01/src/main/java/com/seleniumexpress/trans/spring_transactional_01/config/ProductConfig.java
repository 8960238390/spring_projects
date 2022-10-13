package com.seleniumexpress.trans.spring_transactional_01.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com")
@EnableTransactionManagement
public class ProductConfig {

	@Bean
	public DataSource dataSource() {
		
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/product", "root", "root");
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		
		return new JdbcTemplate(dataSource());
	}
	
	@Bean
	public TransactionManager transactionManager(DataSource dataSource) {
		
		return new DataSourceTransactionManager(dataSource);
	}
}
