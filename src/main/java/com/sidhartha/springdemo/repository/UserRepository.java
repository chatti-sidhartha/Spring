package com.sidhartha.springdemo.repository;
import com.sidhartha.springdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{

}
