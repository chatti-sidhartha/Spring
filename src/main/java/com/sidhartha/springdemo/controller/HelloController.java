package com.sidhartha.springdemo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "Day 1: Spring Boot is great! ";
    }
}
