package com.marcosallan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosallan.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
