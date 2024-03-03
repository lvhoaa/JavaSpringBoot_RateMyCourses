package com.example.ratemycourses.entity;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ratings")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; 

    private String author; 

    // course foreign key 
    @ManyToOne
    @JoinColumn(name="course_id")
    private Course course;

    private int stars; 
    private String grade; 
    private int difficulty ;

    @Column(name = "comment", length = 1024)
    private String comment;

    private String date; 
    private boolean anonymous;


    public Rating(int id, String author, Course course,int stars, String grade, int difficulty, String comment,
            String date, boolean anonymous) {
        this.id = id;
        this.author = author;
        this.course = course;
        this.stars = stars;
        this.grade = grade;
        this.difficulty = difficulty;
        this.comment = comment;
        this.date = date;
        this.anonymous = anonymous;
    }

    

    public Rating(int id, String author, int course_id, int stars, String grade, int difficulty, String comment,
            String date, boolean anonymous) {
        this.id = id;
        this.author = author;
        this.stars = stars;
        this.grade = grade;
        this.difficulty = difficulty;
        this.comment = comment;
        this.date = date;
        this.anonymous = anonymous;
    }

    public Rating(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }

    @Override
    public String toString() {
        return "Rating [id=" + id + ", author=" + author + ", course=" + course + ", stars=" + stars + ", grade="
                + grade + ", difficulty=" + difficulty + ", comment=" + comment + ", date=" + date + ", anonymous="
                + anonymous + "]";
    }

}
