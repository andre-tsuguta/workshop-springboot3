package com.andretsuguta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andretsuguta.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
