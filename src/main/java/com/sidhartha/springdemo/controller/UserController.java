package com.sidhartha.springdemo.controller;
import com.sidhartha.springdemo.dto.CreateUserRequest;
import com.sidhartha.springdemo.dto.UserResponse;
import com.sidhartha.springdemo.entity.User;
import com.sidhartha.springdemo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<UserResponse> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("/users/{id}")
    public UserResponse getUser(@PathVariable int id){
        return userService.getUserById(id);
    }
    @PostMapping("/users")
    public UserResponse addUser(@Valid  @RequestBody CreateUserRequest request){
        return userService.addUser(request);
    }

}
