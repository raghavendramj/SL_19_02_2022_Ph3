package com.simplilearn.config;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.simplilearn.dao.PersonDao;
import com.simplilearn.dao.impl.PersonDaoImpl;
import com.simplilearn.service.PersonService;
import com.simplilearn.service.impl.PersonServiceImpl;

@Configuration
public class AppConifg {

	@Bean
	public PersonService personService() {
		return new PersonServiceImpl();
	}

	@Bean
	public PersonDao jdbcPeronsDao() {
		return new PersonDaoImpl();
	}

	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/persondb");
		dataSource.setUsername("root");
		dataSource.setPassword("admin@123");
		return dataSource;
	}
}
