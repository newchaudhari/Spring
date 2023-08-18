package com.navin;

import com.navin.config.DatabaseConfig;
import com.navin.controller.CourseController;
import com.navin.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CourseTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DatabaseConfig.class);
        CourseController courseController = applicationContext.getBean("courseController", CourseController.class);
        addCourse(courseController);
    }

/*    public static CourseController getCourseController() {

        return courseController;
    }*/


    public static void addCourse(CourseController courseController) {
        Course course = new Course();
        course.setCourseName("Spring");
        course.setCoursePrice(15000);
        courseController.addCourse(course);
        System.out.println("end application");
    }

   /* public static void updateCourse(CourseController courseController) {
        Course course = new Course();
        course.setCourseId(200);
        course.setCourseName("Spring JDBC Ultimate");
        course.setCoursePrice(20000);
        courseController.updateCourse(course);
        System.out.println("end application");
    }

    public static void deleteCourse(CourseController courseController) {
        courseController.deleteCourse(200);
        System.out.println("end application");
    }

    public static void getCourse(CourseController courseController) {
        System.out.println(courseController.getCourse(55));
        System.out.println("end application");
    }

    public static void getAllCourses(CourseController courseController) {
        List<Course> allCourses = courseController.getAllCourses();
        for (Course course : allCourses) {
            System.out.println(course);
        }
        System.out.println();

        // OR
        courseController.getAllCourses().forEach(System.out::println);

        System.out.println("end application");
    }*/
}
