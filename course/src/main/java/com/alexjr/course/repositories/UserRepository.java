package com.alexjr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexjr.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
