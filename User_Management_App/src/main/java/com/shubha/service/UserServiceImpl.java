package com.shubha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubha.model.User;
import com.shubha.repository.UserRepo;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo repo;
	
	@Override
	public User createUser(User user) {
		
		return repo.save(user);
	}

	@Override
	public boolean checkEmail(String email) {
		
		return repo.existsByEmail(email);
	}

}
