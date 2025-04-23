package com.devbp.ecommerce_api.repositories;

import com.devbp.ecommerce_api.domain.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
