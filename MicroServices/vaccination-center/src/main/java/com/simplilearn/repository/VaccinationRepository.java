package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.VaccinationCenter;

@Repository
public interface VaccinationRepository extends JpaRepository<VaccinationCenter, Long> {
}

