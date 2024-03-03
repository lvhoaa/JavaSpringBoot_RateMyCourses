package com.example.ratemycourses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratemycourses.dto.LoginDTO;
import com.example.ratemycourses.dto.UserDTO;
import com.example.ratemycourses.entity.User;
import com.example.ratemycourses.response.LoginResponse;
import com.example.ratemycourses.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService; 

    @PostMapping(path="/saveUser")
    public String saveUser(@RequestBody UserDTO userDTO){
        String id = userService.addUser(userDTO);
        return id;
    }

    @PostMapping(path="/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO){
        LoginResponse loginResponse = userService.loginUser(loginDTO);

        return ResponseEntity.ok(loginResponse);
    }

    @GetMapping(path="/users")
    public List <User> getAllUsers(){
        return userService.getAllUsers();
    }
}
