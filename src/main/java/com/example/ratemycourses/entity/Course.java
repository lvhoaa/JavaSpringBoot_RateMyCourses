package com.example.ratemycourses.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;


@Entity
@Table(name="courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; 
    private String code; 

    @Column(name = "name", length = 1024)
    private String name; 

    @Column(name = "description", length = 1024)
    private String description;
    private String credit;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private List <Rating> ratings;
    
    public Course(int id, String code, String name, String description, String credit, List<Rating> ratings) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.credit = credit;
        this.ratings = ratings;
    }

    public Course(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", code=" + code + ", name=" + name + ", description=" + description + ", credit="
                + credit + ", ratings=" + ratings + "]";
    }    
}
