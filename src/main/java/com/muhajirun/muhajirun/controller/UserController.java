package com.muhajirun.muhajirun.controller;

import com.muhajirun.muhajirun.dtos.requestDto.UserRequest;
import com.muhajirun.muhajirun.dtos.responseDto.ApiResponse;
import com.muhajirun.muhajirun.dtos.responseDto.UserResponse;
import com.muhajirun.muhajirun.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping(path = "/api")
public class UserController {
    private final UserService userService;


    @PostMapping(path = "/createAccount")
    public ResponseEntity<ApiResponse<UserResponse>>  createAccount(@RequestBody UserRequest userRequest){
        UserResponse userResponse = userService.createAccount(userRequest);
        ApiResponse<UserResponse> apiResponse = new ApiResponse<>();
        apiResponse.setData(userResponse);
        apiResponse.setStatusCode("00");
        apiResponse.setMessage("created Account Successfully");

        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

//    public UserResponse createAccount(@RequestBody UserRequest userRequest){
//        return UserResponse.builder()
//                .name(userRequest.getName())
//                .emailAddress(userRequest.getEmailAddress())
//                .passWord(userRequest.getPassWord())
//                .build();
//    }
}
