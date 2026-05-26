package com.sidhartha.springdemo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class CreateUserRequest {
    @NotBlank
    private String name;
    @Email @NotBlank
    private String email;
    @NotBlank
    private String password;
    public CreateUserRequest(String name,String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public CreateUserRequest(){

    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
