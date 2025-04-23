package com.devbp.ecommerce_api.repositories;

import com.devbp.ecommerce_api.domain.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
