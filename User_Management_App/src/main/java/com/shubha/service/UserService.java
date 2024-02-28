package com.shubha.service;

import com.shubha.model.User;

public interface UserService {
	
	public User createUser(User user);
	
	public boolean checkEmail(String email);

}
