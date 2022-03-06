package com.simplilearn.model;

import java.util.List;

import com.simplilearn.entity.VaccinationCenter;

public class VaccinationCenterVO {

	private VaccinationCenter center;
	private List<Citizen> citizens;
	public VaccinationCenterVO(VaccinationCenter center, List<Citizen> citizens) {
		super();
		this.center = center;
		this.citizens = citizens;
	}
	public VaccinationCenterVO() {
		super();
	}
	public VaccinationCenter getCenter() {
		return center;
	}
	public void setCenter(VaccinationCenter center) {
		this.center = center;
	}
	public List<Citizen> getCitizens() {
		return citizens;
	}
	public void setCitizens(List<Citizen> citizens) {
		this.citizens = citizens;
	}
}
