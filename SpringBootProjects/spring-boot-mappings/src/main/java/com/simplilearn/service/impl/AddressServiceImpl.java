package com.simplilearn.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Address;
import com.simplilearn.repository.AddressRepository;
import com.simplilearn.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	

	@Autowired
	AddressRepository addressRepository;

	public Address createAddress(Address address) {
		return addressRepository.save(address);
	}

	public List<Address> getAllAddresss() {
		return addressRepository.findAll();
	}

	public Address getAddress(Long id) {
		Optional<Address> optionalAddress = addressRepository.findById(id);

		if (optionalAddress.isPresent())	
			return optionalAddress.get();

		return null;
	}

	public List<Address> getAddress(String city) {
		return addressRepository.findByCity(city);
	}

	public void updateAddress(Long id, Address modifiedAddress) {
		Optional<Address> optionalAddress = addressRepository.findById(id);
		if (optionalAddress.isPresent()) {
			addressRepository.save(modifiedAddress);
		}
	}

	public void deleteAddress(Long id) {
		Optional<Address> optionalAddress = addressRepository.findById(id);
		if (optionalAddress.isPresent()) {
			addressRepository.delete(optionalAddress.get());
		}
	}

}
