package com.devbp.ecommerce_api.repositories;

import com.devbp.ecommerce_api.domain.entities.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, UUID> {
}
