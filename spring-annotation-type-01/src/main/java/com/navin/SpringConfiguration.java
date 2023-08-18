package com.navin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    //setting values by using setters
    @Bean(name = "employee")
    public Employee getEmployee(){
        Employee employee=new Employee();
        employee.setEmployeeId(1);
        employee.setEmployeeName("Navin");
        employee.setEmployeeSalary(52000);
        return employee;
    }

    //setting values by using all arguments constructor
    //by default bean name is method name
    @Bean
    public Product getProduct(){
        Product product=new Product(101,"laptop",75000);
        return product;
    }

}
