package com.muhajirun.muhajirun.service;

import com.muhajirun.muhajirun.dtos.requestDto.UserRequest;
import com.muhajirun.muhajirun.dtos.responseDto.UserResponse;

public interface UserService {
    public UserResponse createAccount(UserRequest userRequest);
}
