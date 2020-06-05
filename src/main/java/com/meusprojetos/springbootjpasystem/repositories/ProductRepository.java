package com.meusprojetos.springbootjpasystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meusprojetos.springbootjpasystem.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
