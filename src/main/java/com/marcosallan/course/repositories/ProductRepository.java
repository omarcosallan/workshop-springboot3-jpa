package com.marcosallan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosallan.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
