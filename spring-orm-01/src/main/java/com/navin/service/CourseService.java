package com.navin.service;

import com.navin.dao.CourseDao;
import com.navin.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    @Transactional
    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }

    /*@Transactional
    public void updateCourse(Course course) {
        courseDao.updateCourse(course);
    }

    @Transactional
    public void deleteCourse(int id) {
        courseDao.deleteCourse(id);
    }

    @Transactional
    public Course getCourse(int id) {
        return courseDao.getCourse(id);
    }

    @Transactional
    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }*/
}
