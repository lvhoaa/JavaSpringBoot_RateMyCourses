package com.example.ratemycourses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ratemycourses.entity.Rating;

@Repository
public interface RatingRepo extends JpaRepository <Rating,Integer> {

}
