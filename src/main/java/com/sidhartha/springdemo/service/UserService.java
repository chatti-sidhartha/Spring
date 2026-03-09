package com.sidhartha.springdemo.service;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
@Service
public class UserService {
    public List<String> getUsers(){
        return Arrays.asList("Sidhartha","Roopa","kaushik");
    }
}
