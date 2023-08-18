package com.navin.dao;

import com.navin.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CourseDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addCourse(Course course) {
        String insertQuery = "Insert into course values(?,?,?)";
        jdbcTemplate.update(insertQuery, course.getCourseId(), course.getCourseName(), course.getCoursePrice());
        System.out.println("course added");
    }

    public void updateCourse(Course course) {
        String updateQuery = "Update course set courseName=?, price=? where id=?";
        jdbcTemplate.update(updateQuery, course.getCourseName(), course.getCoursePrice(), course.getCourseId());
        System.out.println("course updated");

    }

    public void deleteCourse(int id) {
        String deleteQuery = "Delete from course where id=?";
        jdbcTemplate.update(deleteQuery, id);
        System.out.println("course deleted");
    }

    public Course getCourse(int id) {
        String getCourse = "Select * from course where id=?";
        RowMapper<Course> rowMapper = (ResultSet rs, int rowNum) -> {
            Course course = new Course();
            course.setCourseId(rs.getInt("id"));
            course.setCourseName(rs.getString("courseName"));
            course.setCoursePrice(rs.getInt("price"));
            return course;
        };
        Course course = jdbcTemplate.queryForObject(getCourse, rowMapper, id);
        return course;
    }

    public List<Course> getAllCourses() {
        String getAllCourses = "Select * From course";
        RowMapper<Course> rowMapper = (rs, rowNum) -> {
            Course course = new Course();
            course.setCourseId(rs.getInt("id"));
            course.setCourseName(rs.getString("courseName"));
            course.setCoursePrice(rs.getInt("price"));
            return course;
        };
        List<Course> courseList = jdbcTemplate.query(getAllCourses, rowMapper);
        return courseList;
    }
}
