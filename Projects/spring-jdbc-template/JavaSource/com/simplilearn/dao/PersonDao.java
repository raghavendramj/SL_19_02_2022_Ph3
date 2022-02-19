package com.simplilearn.dao;

import java.util.List;

import com.simplilearn.entity.Person;

public interface PersonDao extends Dao<Person> {
	
	List<Person> findPersonByFirstName(String firstName);

	List<Person> findPersonByLastName(String lastName);

	Long getPeopleCount();

	void updateAddress(long id, String newAddress);

}
