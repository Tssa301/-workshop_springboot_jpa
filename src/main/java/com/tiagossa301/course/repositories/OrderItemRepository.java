package com.tiagossa301.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagossa301.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
