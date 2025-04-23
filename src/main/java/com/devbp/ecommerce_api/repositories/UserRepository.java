package com.devbp.ecommerce_api.repositories;

import com.devbp.ecommerce_api.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
