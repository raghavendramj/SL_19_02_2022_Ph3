package com.simplilearn.service;

import java.util.List;

import com.simplilearn.entity.VaccinationCenter;
import com.simplilearn.model.VaccinationCenterVO;

public interface VaccinationCenterService {

	//CREATE
    VaccinationCenter saveVaccinationCenter(VaccinationCenter vaccinationCenter);
    
	//READ
    List<VaccinationCenter> geVaccinationCenters();
    VaccinationCenter getVaccinationCenter(Long id);
    
    VaccinationCenterVO getCitizenInfoBasedOnVaccinationCenter(Long centerId);
}
