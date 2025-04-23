package com.devbp.ecommerce_api.services.impl;

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
    public UserDto getUserById(UUID id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));

        return userMapper.toDto(user);
    }
}
