package com.devbp.ecommerce_api.services;

import com.devbp.ecommerce_api.domain.dtos.UserDto;

import java.util.UUID;

public interface UserService {

    UserDto getUserById(UUID id);
}
