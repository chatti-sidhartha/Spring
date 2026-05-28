package com.sidhartha.springdemo.service;

import com.sidhartha.springdemo.dto.UserResponse;
import com.sidhartha.springdemo.entity.User;
import com.sidhartha.springdemo.exception.UserNotFoundException;
import com.sidhartha.springdemo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.sidhartha.springdemo.dto.CreateUserRequest;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository =userRepository;
    }
    public List<UserResponse> getAllUsers(){
        List<User> users= userRepository.findAll();
        return users.stream()
                .map(user -> new UserResponse(
                        user.getId(),
                        user.getName(),
                        user.getEmail()
                ))
                .collect(Collectors.toList());
    }
    public UserResponse addUser(CreateUserRequest request){
        User user = new User(
                request.getName(),
                request.getEmail(),
                request.getPassword()
        );
        User savedUser = userRepository.save(user);
        return new UserResponse(
                savedUser.getId(),
                savedUser.getName(),
                savedUser.getEmail()
        );
    }




}
