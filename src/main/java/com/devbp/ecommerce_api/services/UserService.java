package com.devbp.ecommerce_api.services;

import com.devbp.ecommerce_api.domain.dtos.RegisterUserDto;
import com.devbp.ecommerce_api.domain.dtos.UserDto;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

public interface UserService {

    UserDto registerUser(RegisterUserDto registerUserDto);

    UserDto getUserById(UUID id);

    List<UserDto> getAllUsers();

    UserDto updateUser(UUID id, UserDto userDto);
}
