package com.alexjr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexjr.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
