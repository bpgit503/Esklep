package com.devbp.ecommerce_api.controllers;

import com.devbp.ecommerce_api.domain.dtos.UserDto;
import com.devbp.ecommerce_api.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/user")
public class UserController {

    private final UserService userService;

    @GetMapping("{/id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable UUID id) {

        UserDto user = userService.getUserById(id);
        return ResponseEntity.ok(user);

    }
}
