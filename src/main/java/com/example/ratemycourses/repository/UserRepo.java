package com.example.ratemycourses.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ratemycourses.entity.User;

@Repository
public interface UserRepo extends JpaRepository <User,Integer>{
    Optional <User> findOneByEmailAndPassword(String email, String password);
    

    User findByEmail(String email);

}
