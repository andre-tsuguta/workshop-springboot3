package com.andretsuguta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andretsuguta.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
