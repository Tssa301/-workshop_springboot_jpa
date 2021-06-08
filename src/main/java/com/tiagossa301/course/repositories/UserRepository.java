package com.tiagossa301.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagossa301.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
