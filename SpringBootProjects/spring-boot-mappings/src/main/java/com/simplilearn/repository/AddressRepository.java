package com.simplilearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
	List<Address> findByCity(String cityName);
}
