package com.navin.controller;

import com.navin.service.PService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("controller")
public class PController {
    @Autowired
    PService pService;
    public void addProduct(){
        System.out.println("Add Controller");
        pService.addProduct();
    }
    public void removeProduct(){
        System.out.println("Remove Controller");
        pService.removeProduct();
    }
}
