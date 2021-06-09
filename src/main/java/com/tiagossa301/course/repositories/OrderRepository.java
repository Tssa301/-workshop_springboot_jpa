package com.tiagossa301.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagossa301.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
