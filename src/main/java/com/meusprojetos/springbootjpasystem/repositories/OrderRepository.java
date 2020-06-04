package com.meusprojetos.springbootjpasystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meusprojetos.springbootjpasystem.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
