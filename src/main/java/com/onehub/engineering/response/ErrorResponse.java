package com.onehub.engineering.response;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ErrorResponse {
    private String message;
    private HttpStatus status;
}