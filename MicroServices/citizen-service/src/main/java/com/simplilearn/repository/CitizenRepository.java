package com.simplilearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Citizen;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Long> {
	List<Citizen> findByVaccinationCenterId(Long centerId);

}
