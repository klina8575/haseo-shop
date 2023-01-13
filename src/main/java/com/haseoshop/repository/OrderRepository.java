package com.haseoshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haseoshop.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
