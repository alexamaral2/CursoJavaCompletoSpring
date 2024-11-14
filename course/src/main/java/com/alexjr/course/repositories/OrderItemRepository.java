package com.alexjr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexjr.course.entities.OrderItem;
import com.alexjr.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
	
}
