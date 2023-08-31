package com.muhajirun.muhajirun.dtos.responseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse <T>{
    private String statusCode;
    private boolean HttpHeader;
    private String message;
    private T data;
    private final LocalDateTime time = LocalDateTime.now();
}
