package com.example.ratemycourses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ratemycourses.entity.Rating;
import com.example.ratemycourses.repository.RatingRepo;

@Service
public class RatingService {
    @Autowired
    private RatingRepo ratingRepo; 

    public void saveRating(Rating newRating){
        System.out.println("saving rating");
        System.out.println(newRating);
        ratingRepo.save(newRating);
    }
}
