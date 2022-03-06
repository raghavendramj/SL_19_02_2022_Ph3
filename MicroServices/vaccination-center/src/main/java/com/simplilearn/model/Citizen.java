package com.simplilearn.model;

public class Citizen {
	
	private Long id;
	private int age;
	private String email;
	private String name;
	private Long vaccinationCenterId;

	public Citizen(Long id, int age, String email, String name, Long vaccinationCenterId) {
		super();
		this.id = id;
		this.age = age;
		this.email = email;
		this.name = name;
		this.vaccinationCenterId = vaccinationCenterId;
	}

	public Citizen() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getVaccinationCenterId() {
		return vaccinationCenterId;
	}

	public void setVaccinationCenterId(Long vaccinationCenterId) {
		this.vaccinationCenterId = vaccinationCenterId;
	}

}
