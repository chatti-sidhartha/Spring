package com.sidhartha.springdemo.service;

import com.sidhartha.springdemo.dto.UserResponse;
import com.sidhartha.springdemo.entity.User;
import com.sidhartha.springdemo.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.sidhartha.springdemo.dto.CreateUserRequest;

@Service
public class UserService {
    private List<User> Users = new ArrayList<>();
    public UserService() {
        Users.add(new User(1, "Sidhartha", "scs169273@gmail.com","123456"));
    }
    public List<UserResponse> getUsers(){
        List<UserResponse> responseList = new ArrayList<>();
        for(User user:Users){
            responseList.add(
                    new UserResponse(
                            user.getId(),
                            user.getName(),
                            user.getEmail()
                    )
            );
        }
        return responseList;
    }

    public UserResponse addUser(CreateUserRequest request){
        int id = Users.size()+1;
        User user = new User(id, request.getName(), request.getEmail(),request.getPassword());
        Users.add(user);
        return new UserResponse(user.getId(), user.getName(), user.getEmail());
    }
    public UserResponse getUserById(int id){

        User user =  Users.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException("User not found"));
        return new UserResponse(user.getId(), user.getName(), user.getEmail());
    }

}
