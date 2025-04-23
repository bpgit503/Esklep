package com.devbp.ecommerce_api.repositories;

import com.devbp.ecommerce_api.domain.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CartItemRepository extends JpaRepository<CartItem, UUID> {
}
