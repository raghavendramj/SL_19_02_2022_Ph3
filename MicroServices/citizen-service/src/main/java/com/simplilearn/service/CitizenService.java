package com.simplilearn.service;

import java.util.List;

import com.simplilearn.entity.Citizen;

public interface CitizenService {

	// CREATE
	Citizen createCitizen(Citizen citizen);

	// READ
	List<Citizen> getCitizens();
	Citizen getCitizen(Long id);
	List<Citizen> getCitizens(Long centerId);

	// UPDATE
	void updateCitizen(Long id, Citizen citizen);

	// DELETE
	void deleteCitizen(Long id);
}
