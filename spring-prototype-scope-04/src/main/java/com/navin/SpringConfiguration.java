package com.navin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Objects;

@Configuration
@PropertySource("spring.cfg.properties")
public class SpringConfiguration {
    @Autowired
    Environment environment;
    @Bean(name = "employee")
    public Employee getemployee(){
        Employee employee = new Employee();
        employee.setEmployeeId(Integer.parseInt(Objects.requireNonNull(environment.getProperty("employeeId"))));
        employee.setEmployeeName(environment.getProperty("employeeName"));
        employee.setEmployeeSalary(Integer.parseInt(Objects.requireNonNull(environment.getProperty("employeeSalary"))));
        return employee;
    }

    @Bean(name = "person")
    public Person getPerson(){
        Person person=new Person();
        person.setPersonId(12);
        person.setPersonName("Bhavesh");
        person.setAddress(Address.builder()
                    .street("Vitthal Mandir")
                    .city("Padalse")
                    .state("Maharashtra")
                    .country("India")
                    .pinNumber(425503)
                    .build());
        return person;
    }

}
