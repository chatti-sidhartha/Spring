package com.sidhartha.springdemo.entity;
import jakarta.validation.constraints.*;
public class User {
    private int id;
    @NotBlank(message = "Name cant be empty")
    private String name;
    @Email(message = "Invalid email format")
    private String email;
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

