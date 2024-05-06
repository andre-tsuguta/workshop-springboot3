package com.andretsuguta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andretsuguta.course.entities.OrderItem;
import com.andretsuguta.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
