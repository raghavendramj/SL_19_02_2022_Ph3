package com.simplilearn.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Citizen;
import com.simplilearn.repository.CitizenRepository;
import com.simplilearn.service.CitizenService;


@Service
public class CitizenServiceImpl implements CitizenService {

	@Autowired
	CitizenRepository citizenRepository;

	@Override
	public Citizen createCitizen(Citizen citizen) {
		return citizenRepository.save(citizen);
	}

	@Override
	public List<Citizen> getCitizens() {
		return citizenRepository.findAll();
	}
	
	@Override
	public List<Citizen> getCitizens(Long centerId) {
		return citizenRepository.findByVaccinationCenterId(centerId);
	}

	@Override
	public Citizen getCitizen(Long id) {
		// data -> 1 to 10 -> findById(35) -> isPresent -> true/false
		Optional<Citizen> optionalCitizen = citizenRepository.findById(id);

		if (optionalCitizen.isPresent()) {
			return optionalCitizen.get();
		}
		return null;
	}

	@Override
	public void updateCitizen(Long id, Citizen citizen) {
		// data -> 1 to 10 -> findById(35) -> isPresent -> true/false
		Optional<Citizen> optionalCitizen = citizenRepository.findById(id);

		if (optionalCitizen.isPresent()) {
			citizenRepository.save(citizen);
		}
	}

	@Override
	public void deleteCitizen(Long id) {
		// data -> 1 to 10 -> findById(35) -> isPresent -> true/false
		Optional<Citizen> optionalCitizen = citizenRepository.findById(id);

		if (optionalCitizen.isPresent()) {
			citizenRepository.delete(optionalCitizen.get());
		}
	}
}
