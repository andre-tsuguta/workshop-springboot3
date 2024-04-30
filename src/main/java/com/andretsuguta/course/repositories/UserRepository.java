package com.andretsuguta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andretsuguta.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
