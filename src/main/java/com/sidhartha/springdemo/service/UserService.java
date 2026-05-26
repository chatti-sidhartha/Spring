package com.sidhartha.springdemo.service;

import com.sidhartha.springdemo.entity.User;
import com.sidhartha.springdemo.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private List<User> Users = new ArrayList<>();
    public UserService() {
        Users.add(new User(1, "Sidhartha", "scs169273@gmail.com"));
        Users.add(new User(2,"roopa","roo1836@gmail.com"));
        Users.add(new User(3,"kasuhik","sasanapuri@gmail.com"));
    }
    public List<User> getUsers(){
        return Users;
    }

    public User addUser(User user){
        Users.add(user);
        return user;
    }
    public User getUserById(int id){

        return Users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException("User not found"));
    }

}
