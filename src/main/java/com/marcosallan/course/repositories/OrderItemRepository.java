package com.marcosallan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosallan.course.entities.OrderItem;
import com.marcosallan.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
