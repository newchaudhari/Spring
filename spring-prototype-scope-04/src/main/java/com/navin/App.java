package com.navin;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // using xml way
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Employee employee1 = applicationContext.getBean("employee", Employee.class);
        System.out.println("employee1 by xml way: "+employee1);

        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);


    }
}
