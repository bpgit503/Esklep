package com.devbp.ecommerce_api.repositories;

import com.devbp.ecommerce_api.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
