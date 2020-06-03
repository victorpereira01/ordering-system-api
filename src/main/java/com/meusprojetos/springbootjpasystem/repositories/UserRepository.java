package com.meusprojetos.springbootjpasystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meusprojetos.springbootjpasystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
