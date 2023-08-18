package com.navin;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // using xml way
        ApplicationContext applicationContext=new GenericXmlApplicationContext("spring.cfg.xml");

        Employee employee1 = applicationContext.getBean("employee", Employee.class);
        System.out.println("employee1 by xml way: "+employee1);

        Employee employee2 = applicationContext.getBean("employee2", Employee.class);
        System.out.println("employee2 by xml way: "+employee2);
    }
}
