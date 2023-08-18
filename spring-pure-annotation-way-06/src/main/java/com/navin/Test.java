package com.navin;

import com.navin.config.SpringConfiguration;
import com.navin.controller.PController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        PController pController = applicationContext.getBean("controller", PController.class);
        pController.addProduct();
        pController.removeProduct();
    }

}
