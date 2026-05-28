package com.sidhartha.springdemo.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank @Size(max = 10)
    private String name;
    @Email @NotBlank
    private String email;
    @NotBlank
    private String password;
    public User(){

    }

    public User( String name, String email,String password) {
        this.name = name;
        this.email = email;
        this.password = password;
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
    public String getPassword(){
        return password;
    }

}

