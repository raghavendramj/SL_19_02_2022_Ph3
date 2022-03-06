package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.Citizen;
import com.simplilearn.service.CitizenService;

@RestController
@RequestMapping("/citizens")
public class CitizenController {

	@Autowired
	CitizenService citizenService;

	@PostMapping
	public Citizen createCitizen(@RequestBody Citizen citizen) {
		return citizenService.createCitizen(citizen);
	}

	@GetMapping
	public List<Citizen> getCitizens() {
		return citizenService.getCitizens();
	}

	@GetMapping("/{id}")
	public Citizen getCitizen(@PathVariable("id") Long citizenId) {
		return citizenService.getCitizen(citizenId);
	}

	@GetMapping("/center/{centerId}")
	public List<Citizen> getCitizensByCenterId(@PathVariable("centerId") Long centerId) {
		return citizenService.getCitizens(centerId);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateCitizen(@PathVariable("id") Long id, @RequestBody Citizen citizen) {
		citizenService.updateCitizen(id, citizen);
		return new ResponseEntity<>("Succesfully udpated!", HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCitizen(@PathVariable("id") Long citizenId) {
		citizenService.deleteCitizen(citizenId);
		return new ResponseEntity<>("Succesfully deleted!", HttpStatus.OK);
	}
}
