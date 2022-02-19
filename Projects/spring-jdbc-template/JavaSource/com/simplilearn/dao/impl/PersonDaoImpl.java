package com.simplilearn.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.simplilearn.dao.PersonDao;
import com.simplilearn.entity.Person;

public class PersonDaoImpl implements PersonDao {

	@Autowired
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;

	@PostConstruct
	private void postConstruct() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void save(Person person) {
		String sqlQuery = "insert into Person(first_name, last_name, address) values (?, ?, ?)";
		jdbcTemplate.update(sqlQuery, person.getFirstName(), person.getLastName(), person.getAddress());

	}

	public Person load(long id) {
		List<Person> people = getPeople("select * from Person where id=?", new Object[] { id });
		if (people.size() > 0) {
			return people.get(0);
		}
		return null;
	}

	public List<Person> loadAll() {
		return getPeople("select * from person", null);
	}

	private List<Person> getPeople(String sqlQuery, Object params[]) {
		return jdbcTemplate.query(sqlQuery, params, (resultSet, i) -> {
			return toPerson(resultSet);
		});
	}

	@Override
	public List<Person> findPersonByFirstName(String firstName) {
		return getPeople("select * from Person where first_name=?", new Object[] { firstName });
	}

	@Override
	public List<Person> findPersonByLastName(String lastName) {
		return getPeople("select * from Person where last_name=?", new Object[] { lastName });
	}

	@Override
	public Long getPeopleCount() {
		return jdbcTemplate.queryForObject("select count(*) from PERSON", Long.class);
	}

	private Person toPerson(ResultSet resultSet) throws SQLException {
		Person person = new Person();
		person.setId(resultSet.getLong("id"));
		person.setFirstName(resultSet.getString("first_name"));
		person.setLastName(resultSet.getString("last_name"));
		person.setAddress(resultSet.getString("address"));
		return person;
	}

	@Override
	public void delete(long id) {
		jdbcTemplate.update("delete from PERSON where id = ?", id);
	}

	@Override
	public void update(Person person) {
		String sqlQuery = "update person set first_name =?, last_name=?, address=?";
		jdbcTemplate.update(sqlQuery, person.getFirstName(), person.getLastName(), person.getAddress());
	}

	@Override
	public void updateAddress(long id, String newAddress) {
		jdbcTemplate.update("update PERSON set ADDRESS = ? where ID = ?", newAddress, id);
	}

}
