package com.navin.service;

import com.navin.dao.PDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PService {
    @Autowired
    PDao pDao;
    public void addProduct(){
        System.out.println("Add Service");
        pDao.addProduct();
    }
    public void removeProduct(){
        System.out.println("Remove Service");
        pDao.removeProduct();
    }
}
