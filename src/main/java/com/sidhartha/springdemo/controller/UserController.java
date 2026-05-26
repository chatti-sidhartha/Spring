package com.sidhartha.springdemo.controller;
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
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        return userService.getUserById(id);
    }
    @PostMapping("/users")
    public User addUSer(@Valid  @RequestBody User user){
        return userService.addUser(user);
    }

}
