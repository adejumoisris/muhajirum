package com.muhajirun.muhajirun.service.implementation;

import com.muhajirun.muhajirun.dtos.requestDto.UserRequest;
import com.muhajirun.muhajirun.dtos.responseDto.UserResponse;
import com.muhajirun.muhajirun.model.User;
import com.muhajirun.muhajirun.repository.UserRepository;
import com.muhajirun.muhajirun.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class UserImplementation implements UserService {

    private final UserRepository userRepository;
    @Override
    public UserResponse createAccount(UserRequest userRequest) {
        log.info("service: about creating user");
        // creating a new object of user
        User user = new User();
        user.setName(userRequest.getName());
        user.setEmailAddress(userRequest.getEmailAddress());
        user.setPassWord(userRequest.getPassWord());

        log.info("about user creating Account");
        User  createAccount = userRepository.save(user);
        log.info("Account created");


        return new UserResponse(createAccount.getName(), createAccount.getEmailAddress(), createAccount.getPassWord());
    }
}
