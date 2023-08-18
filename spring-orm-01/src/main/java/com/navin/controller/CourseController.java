package com.navin.controller;

import com.navin.model.Course;
import com.navin.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("courseController")
public class CourseController {
    @Autowired
    CourseService courseService;

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }

   /* public void updateCourse(Course course) {
        courseService.updateCourse(course);
    }

    public void deleteCourse(int id) {
        courseService.deleteCourse(id);
    }

    public Course getCourse(int id) {
        return courseService.getCourse(id);
    }

    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }*/
}
