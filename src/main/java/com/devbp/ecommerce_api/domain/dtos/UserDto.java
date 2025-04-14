package com.devbp.ecommerce_api.domain.dtos;

import com.devbp.ecommerce_api.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private UUID id;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private boolean isActive;
    private Role role;
    private String createdAt;
    private String updatedAt;
    private List<AddressDto> addresses;
}
