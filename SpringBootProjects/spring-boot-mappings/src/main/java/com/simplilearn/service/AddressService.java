package com.simplilearn.service;

import java.util.List;

import com.simplilearn.entity.Address;

public interface AddressService {
	public Address createAddress(Address address);

	public List<Address> getAllAddresss();

	public Address getAddress(Long id);

	public List<Address> getAddress(String city);

	public void updateAddress(Long id, Address modifiedAddress);

	public void deleteAddress(Long id);

}
