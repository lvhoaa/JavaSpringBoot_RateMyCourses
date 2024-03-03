package com.example.ratemycourses.service;

import java.util.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.ratemycourses.dto.LoginDTO;
import com.example.ratemycourses.dto.UserDTO;
import com.example.ratemycourses.entity.User;
import com.example.ratemycourses.repository.UserRepo;
import com.example.ratemycourses.response.LoginResponse;


@Service
public class UserService{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String addUser(UserDTO userDTO){
        
        User newUser = new User(userDTO.getId(),userDTO.getName(),userDTO.getEmail(),this.passwordEncoder.encode(userDTO.getPassword()));
        userRepo.save(newUser);
        
        return newUser.getName();
    }

    public LoginResponse loginUser(LoginDTO loginDTO){
        User user1 = userRepo.findByEmail(loginDTO.getEmail());
        if (user1 != null){
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password,encodedPassword);
            if (isPwdRight){
                return new LoginResponse("Login success",  true);
            } else{
                return new LoginResponse("password not match",false);
            }
        }
        return new LoginResponse("email invalid",false);
    }

    public List <User> getAllUsers(){
        return userRepo.findAll();
    }
}
