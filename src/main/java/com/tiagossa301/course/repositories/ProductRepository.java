package com.tiagossa301.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagossa301.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
