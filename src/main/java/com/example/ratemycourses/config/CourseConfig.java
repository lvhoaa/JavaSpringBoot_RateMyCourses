package com.example.ratemycourses.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import com.example.ratemycourses.entity.Course;
import com.example.ratemycourses.entity.Rating;
import com.example.ratemycourses.repository.CourseRepo;

@Configuration
public class CourseConfig {
    @Bean
    CommandLineRunner commandLineRunner (CourseRepo courseRepo){
        return args -> {
            Course c1 = new Course(1,"CICS 109","INTRODUCTION TO DATA ANALYSIS IN R","An introduction to data analysis in the open-source R language, with an emphasis on practical data work. Topics will include data wrangling, summary statistics, modeling, and visualization. Will also cover fundamental programming concepts including data types, functions, flow of control, and good programming practices.","1",List.of());
            Rating r1 = new Rating(1,"testing bom",c1,5,"A",4,"really nice course. Would take it again","02/29/2024",false);
            Rating r2 = new Rating(2,"author hoa",c1,3,"B",3,"Really hard course ","02/28/2024",false);
            c1.setRatings(List.of(r1,r2));
            
            Course c2 = new Course(2, "CICS 110","FOUNDATIONS OF PROGRAMMING","An introduction to computer programming and problem-solving using computers. This course teaches you how real-world problems can be solved computationally using programming constructs and data abstractions of a modern programming language.","4",List.of());
            Course c3 = new Course(3, "CICS 127", "INTRODUCTION TO PUBLIC INTEREST TECHNOLOGY","Today's world is complex and tech-driven. How do we use the tools of information technology to solve problems in a socially responsible way","4",List.of());
            Course c4 = new Course (4, "CICS 160",  "OBJECT-ORIENTED PROGRAMMING","This course will expose students to programming practices beyond the introductory level, concentrating on Object-Oriented Programming techniques and an introduction to Data Structures. Students will also study and analyze the complexity of both the algorithms presented in class and of the algorithms they develop.","4",List.of());

            courseRepo.saveAll(List.of(c1,c2,c3,c4));
        };
    }
}
