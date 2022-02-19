package com.simplilearn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.simplilearn.dao.PersonDao;
import com.simplilearn.entity.Person;
import com.simplilearn.service.PersonService;

public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao personDao;

	@Override
	public void savePerson(Person person) {
		personDao.save(person);
	}

	@Override
	public List<Person> getPeople() {
		return personDao.loadAll();
	}

	@Override
	public List<Person> getPeopleByLastName(String lastName) {
		return personDao.findPersonByLastName(lastName);
	}

	@Override
	public Person getPerson(long id) {
		return personDao.load(id);
	}

	@Override
	public void deletePerson(long id) {
		personDao.delete(id);
	}


	@Override
	public List<Person> getPeopleByFirstName(String firstName) {
		return personDao.findPersonByFirstName(firstName);
	}

	@Override
	public void updateAddress(long id, String address) {
		personDao.updateAddress(id, address);
	}
}
