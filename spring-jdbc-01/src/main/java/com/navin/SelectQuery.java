package com.navin;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.Map;

public class SelectQuery {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

        RowMapper<Course> rowMapper = (resultSet, rowNum) -> {
            Course course = new Course();
            course.setId(resultSet.getInt("id"));
            course.setCourseName(resultSet.getString("courseName"));
            course.setPrice((resultSet.getInt("price")));
        return course;
    }

    ;

    String query = "SELECT * FROM course";
    List<Course> courses = jdbcTemplate.query(query, rowMapper);
        for(
    Course course:courses)

    {
        System.out.println(course);

    }
}
}
