package com.example.ratemycourses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.ratemycourses.entity.Course;
import com.example.ratemycourses.repository.CourseRepo;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo; 

    public List<Course> getAllCourses(){
        return courseRepo.findAll();
    }

    public Course getCourse(String code) {
        Optional <Course> optionalCourse = courseRepo.findOneByCode(code);
        return optionalCourse.orElse(null); 
    }

    public Course getCourse(int id){
        Optional <Course> optionalCourse = courseRepo.findOneById(id);
        return optionalCourse.orElse(null); 
    }

    public void saveCourse(Course c){
        courseRepo.save(c);
    }
    
}
