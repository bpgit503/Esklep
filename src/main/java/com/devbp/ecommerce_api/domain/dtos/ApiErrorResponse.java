package com.devbp.ecommerce_api.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiErrorResponse {

    private String message;
    private int status;
    private List<FieldErrors> errors;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class FieldErrors{
        private String field;
        private String message;
    }




}
