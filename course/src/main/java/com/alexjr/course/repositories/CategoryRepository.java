package com.alexjr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexjr.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
