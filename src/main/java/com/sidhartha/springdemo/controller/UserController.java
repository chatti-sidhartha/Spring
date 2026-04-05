package com.sidhartha.springdemo.controller;
import com.sidhartha.springdemo.entity.User;
import com.sidhartha.springdemo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @PostMapping("/users")
    public User addUSer(@Valid  @RequestBody User user){
        return userService.addUser(user);
    }

}