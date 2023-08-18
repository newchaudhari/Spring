package com.navin;


import com.navin.config.SpringConfiguration;
import com.navin.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Product product = applicationContext.getBean("product", Product.class);
        System.out.println(product);
    }
}
