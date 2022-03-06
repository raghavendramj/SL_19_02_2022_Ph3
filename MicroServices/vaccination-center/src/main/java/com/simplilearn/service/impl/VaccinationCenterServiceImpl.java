package com.simplilearn.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.simplilearn.entity.VaccinationCenter;
import com.simplilearn.model.Citizen;
import com.simplilearn.model.VaccinationCenterVO;
import com.simplilearn.repository.VaccinationRepository;
import com.simplilearn.service.VaccinationCenterService;

@Service
public class VaccinationCenterServiceImpl implements VaccinationCenterService {
	@Autowired
	VaccinationRepository vaccinationRepository;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public VaccinationCenter saveVaccinationCenter(VaccinationCenter vaccinationCenter) {
		return vaccinationRepository.save(vaccinationCenter);
	}

	@Override
	public List<VaccinationCenter> geVaccinationCenters() {
		return vaccinationRepository.findAll();
	}

	@Override
	public VaccinationCenter getVaccinationCenter(Long id) {
		Optional<VaccinationCenter> optionalVaccinationCenter = vaccinationRepository.findById(id);

		if (optionalVaccinationCenter.isPresent())
			return optionalVaccinationCenter.get();

		return null;
	}

	@Override
	public VaccinationCenterVO getCitizenInfoBasedOnVaccinationCenter(Long centerId) {

		VaccinationCenter vaccinationCenter = getVaccinationCenter(centerId);
		String url = "http://localhost:8086/citizens/center/" + centerId;
		List<Citizen> citizens = restTemplate.getForObject(url, List.class);
		
		VaccinationCenterVO vaccinatioCenterVO = new VaccinationCenterVO();
		vaccinatioCenterVO.setCenter(vaccinationCenter);
		vaccinatioCenterVO.setCitizens(citizens);
		return vaccinatioCenterVO;
	}
}
