package com.example.ratemycourses.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ratemycourses.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer>{
    Optional <Course> findOneByCode(String code);

    Optional <Course> findOneById(int id);

}
