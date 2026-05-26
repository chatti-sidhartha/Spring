package com.sidhartha.springdemo.entity;
import jakarta.validation.constraints.*;
public class User {
    private int id;
    @NotBlank @Size(max = 10)
    private String name;
    @Email @NotBlank
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

