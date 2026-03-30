package com.sidhartha.springdemo.service;

import com.sidhartha.springdemo.entity.User;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
@Service
public class UserService {
    public List<User> getUsers(){
        User u1 = new User(1, "Sidhartha", "scs169273@gmail.com");
        User u2 = new User(2,"roopa","roo1836@gmail.com");
        User u3 = new User(3,"kasuhik","sasanapuri@gmail.com");

        return Arrays.asList(u1,u2,u3);
    }
}
