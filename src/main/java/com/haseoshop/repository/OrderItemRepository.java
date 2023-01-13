package com.haseoshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haseoshop.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
