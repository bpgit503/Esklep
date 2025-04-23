package com.devbp.ecommerce_api.repositories;

import com.devbp.ecommerce_api.domain.entities.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductImageRepository extends JpaRepository<ProductImage, UUID> {
}
