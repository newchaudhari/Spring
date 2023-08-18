package com.navin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Configuration
public class SpringConfiguration {

    @Bean(name = "employee")
    public Employee getEmployee(){
        Employee employee=new Employee();
        employee.setEmployeeId(11);
        employee.setEmployeeName("Vinit");
        employee.setEmployeeSalary(500000);
        employee.setEmployeeAddress(List.of("Padalse","Bhusawal","Pune","mumbai"));
        return employee;
    }

    @Bean(name = "product")
    public Product getProduct(){
        Product product=new Product();
        product.setProductId(201);
        product.setProductName("Mobile");
        product.setProductPrice(50000);
        product.setProductDescription(Set.of("Black","snapdragon","ultra HD Display","50 MP camera"));
        return product;
    }

    @Bean(name = "student")
    public Student getStudent(){
        Student student=new Student();
        student.setStudentId(51);
        student.setStudentName("Shree");
        student.setStudentMarks(Map.of("Math",96,"Physics ",83,"Chemistry",89));
        return student;
    }
}
