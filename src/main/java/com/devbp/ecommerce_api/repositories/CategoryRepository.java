package com.devbp.ecommerce_api.repositories;

import com.devbp.ecommerce_api.domain.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
