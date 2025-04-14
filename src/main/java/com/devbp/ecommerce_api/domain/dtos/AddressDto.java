package com.devbp.ecommerce_api.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDto {

    private UUID id;
    private  String street;
    private  String city;
    private  String country;
    private  String postalCode;
//    private UserDto user;
    private boolean isDefault;

}
