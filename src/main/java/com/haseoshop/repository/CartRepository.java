package com.haseoshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.haseoshop.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
