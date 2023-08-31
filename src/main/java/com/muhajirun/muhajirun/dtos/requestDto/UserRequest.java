package com.muhajirun.muhajirun.dtos.requestDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserRequest {
    private String name;
    private String emailAddress;
    private String passWord;
}
