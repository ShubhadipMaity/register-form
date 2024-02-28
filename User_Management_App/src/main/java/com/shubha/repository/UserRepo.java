package com.shubha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shubha.model.User;

public interface UserRepo extends JpaRepository<User,Integer> {

		public boolean existsByEmail(String email);
}
