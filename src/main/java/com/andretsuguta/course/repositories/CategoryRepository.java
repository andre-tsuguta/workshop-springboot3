package com.andretsuguta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andretsuguta.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
