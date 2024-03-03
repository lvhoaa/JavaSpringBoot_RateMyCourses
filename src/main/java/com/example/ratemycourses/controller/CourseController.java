package com.example.ratemycourses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.ratemycourses.entity.Course;
import com.example.ratemycourses.entity.Rating;
import com.example.ratemycourses.service.CourseService;
import com.example.ratemycourses.service.RatingService;

import java.util.List;;


@Controller

public class CourseController {
    @Autowired
    private CourseService courseService ;   
    
    @Autowired
    private RatingService ratingService;

    @GetMapping(path="/")
    public ModelAndView home(){
        List <Course> courses = courseService.getAllCourses();
        System.out.println("hello homepage");
        return new ModelAndView("home","courses",courses);
    }

    @GetMapping(path="/course/{courseCode}")
    public ModelAndView coursePage(@PathVariable("courseCode") String courseCode){
        Course course = courseService.getCourse(courseCode);
        ModelAndView m = new ModelAndView("course");
        m.addObject("course",course);
        m.addObject("ratings",course.getRatings());
        return m;
    }

}
