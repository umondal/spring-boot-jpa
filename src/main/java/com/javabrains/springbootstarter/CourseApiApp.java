package com.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Tells Spring Boot that this is the starting point for our application.
@SpringBootApplication
public class CourseApiApp {
    public static void main(String[] args){
        SpringApplication.run(CourseApiApp.class, args);
    }

}
