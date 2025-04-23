package com.devbp.ecommerce_api.services.impl;

import com.devbp.ecommerce_api.domain.dtos.RegisterUserDto;
import com.devbp.ecommerce_api.domain.dtos.UserDto;
import com.devbp.ecommerce_api.domain.entities.User;
import com.devbp.ecommerce_api.mappers.UserMapper;
import com.devbp.ecommerce_api.repositories.UserRepository;
import com.devbp.ecommerce_api.services.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDto registerUser(RegisterUserDto registerUserDto) {
        if (userRepository.existsByEmail(registerUserDto.getEmail())){
            throw new IllegalArgumentException("Email already in user");
        }

        User user = new User();
        user.setEmail(registerUserDto.getEmail());
        user.setPassword(registerUserDto.getPassword());
        user.setFirstName(registerUserDto.getFirstName());
        user.setLastName(registerUserDto.getLastName());
        user.setActive(true);

        User savedUser = userRepository.save(user);
        return userMapper.toDto(savedUser);
    }

    @Override
    public UserDto getUserById(UUID id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));

        return userMapper.toDto(user);
    }
}
