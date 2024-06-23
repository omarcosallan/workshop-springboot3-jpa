package com.marcosallan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosallan.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
