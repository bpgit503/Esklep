package com.devbp.ecommerce_api.mappers;

import com.devbp.ecommerce_api.domain.dtos.AddressDto;
import com.devbp.ecommerce_api.domain.entities.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    AddressDto toDto(Address address);

    Address toEntity(AddressDto addressDto);
}
