package com.marcosallan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosallan.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
