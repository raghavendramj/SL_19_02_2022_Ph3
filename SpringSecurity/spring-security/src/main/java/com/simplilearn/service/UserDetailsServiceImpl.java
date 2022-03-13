package com.simplilearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.User;
import com.simplilearn.repository.UserRepository;
import com.simplilearn.security.MyUserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User databaseUser = userRepository.findByUsername(username);
		if (databaseUser == null) {
			throw new UsernameNotFoundException("Cannot find the User!");
		}

		return new MyUserDetails(databaseUser);

		// Logic needs to written to fetch from the database.
		// User user = new User("admin", "admin@123", new ArrayList<>());
		// return new MyUserDetails(user);
	}
}
