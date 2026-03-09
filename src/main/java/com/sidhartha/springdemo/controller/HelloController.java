package com.sidhartha.springdemo.controller;
import com.sidhartha.springdemo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class HelloController {
    private final UserService userService;
    //Constructor Injection
    public HelloController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<String> getUsers() {
        return userService.getUsers();
    }
}
