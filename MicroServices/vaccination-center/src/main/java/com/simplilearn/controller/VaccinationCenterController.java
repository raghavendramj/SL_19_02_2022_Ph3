package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.VaccinationCenter;
import com.simplilearn.model.VaccinationCenterVO;
import com.simplilearn.service.VaccinationCenterService;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {

	@Autowired
	VaccinationCenterService vaccinationCenterService;

	@PostMapping
	public VaccinationCenter saveVaccinationCenter(@RequestBody VaccinationCenter center) {
		return vaccinationCenterService.saveVaccinationCenter(center);
	}

	@GetMapping
	public List<VaccinationCenter> getVaccinationCenters() {
		return vaccinationCenterService.geVaccinationCenters();
	}

	@GetMapping("/{centerId}")
	public VaccinationCenter getVaccinationCenterById(@PathVariable("centerId") Long centerId) {
		return vaccinationCenterService.getVaccinationCenter(centerId);
	}
	
	@GetMapping("/citizens/{centerId}")
	public VaccinationCenterVO getCitizensInfoByVaccinationCenterById(@PathVariable("centerId") Long centerId) {
		return vaccinationCenterService.getCitizenInfoBasedOnVaccinationCenter(centerId);
	}
}
