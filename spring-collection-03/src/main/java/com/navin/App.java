package com.navin;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        //Employee address using List
        Employee employee = applicationContext.getBean("employee", Employee.class);
        System.out.println(employee);

        //Product description using Set
        Product product = applicationContext.getBean("product", Product.class);
        System.out.println(product);

        //Student Marks using Map
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);

    }
}
