package com.navin;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.cfg.xml");
        Employee employee = applicationContext.getBean("employee", Employee.class);
        Employee employee2 = applicationContext.getBean("employee", Employee.class);
        System.out.println(employee.hashCode()+"\t"+employee2.hashCode());

    }
}
