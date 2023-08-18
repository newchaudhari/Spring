package com.navin;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Employee employee = applicationContext.getBean("employee", Employee.class);

        System.out.println("Employee by annotation way: "+employee);

        //by default bean name is method name
        Product product = applicationContext.getBean("getProduct", Product.class);
        System.out.println("Product without name in bean: "+product);

    }
}
