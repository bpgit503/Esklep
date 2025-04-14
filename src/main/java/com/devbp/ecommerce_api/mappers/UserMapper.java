package com.devbp.ecommerce_api.mappers;

import com.devbp.ecommerce_api.domain.dtos.UserDto;
import com.devbp.ecommerce_api.domain.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {AddressMapper.class})
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto userDto);

}
