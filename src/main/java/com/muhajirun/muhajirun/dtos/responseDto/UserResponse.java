package com.muhajirun.muhajirun.dtos.responseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserResponse {
    private String name;
    private String emailAddress;
    private String passWord;
}
