package com.navin.service;

import com.navin.dao.CourseDao;
import com.navin.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }

    public void updateCourse(Course course) {
        courseDao.updateCourse(course);
    }

    public void deleteCourse(int id) {
        courseDao.deleteCourse(id);
    }

    public Course getCourse(int id) {
        return courseDao.getCourse(id);
    }

    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }
}
