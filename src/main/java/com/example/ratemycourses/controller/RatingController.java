package com.example.ratemycourses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import com.example.ratemycourses.entity.Course;
import com.example.ratemycourses.entity.Rating;
import com.example.ratemycourses.service.CourseService;
import com.example.ratemycourses.service.RatingService;

@Controller
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @Autowired
    private CourseService courseService;

    @PostMapping("/saveRating/{courseId}")
    public String saveRating(@PathVariable int courseId, @ModelAttribute Rating newRating){
        System.out.println("api endpoint touched here");
        Course c = courseService.getCourse(courseId);

        newRating.setCourse(c);
        newRating.setAnonymous(false);

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String dateString = currentDate.format(formatter);
        newRating.setDate(dateString);

        newRating.setAuthor("hoa");

        System.out.println(newRating);  
        ratingService.saveRating(newRating);
        String courseCode = c.getCode();
        return "redirect:/course/" + courseCode;
    }

}
