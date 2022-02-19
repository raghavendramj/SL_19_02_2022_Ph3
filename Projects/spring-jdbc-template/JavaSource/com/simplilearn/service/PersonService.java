package com.simplilearn.service;

import java.util.List;

import com.simplilearn.entity.Person;

public interface PersonService {

	void savePerson(Person person);

	List<Person> getPeople();

	Person getPerson(long id);

	void deletePerson(long id);

	void updateAddress(long id, String address);

	List<Person> getPeopleByFirstName(String firstName);

	List<Person> getPeopleByLastName(String lastName);

}
