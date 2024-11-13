package com.alexjr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexjr.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
