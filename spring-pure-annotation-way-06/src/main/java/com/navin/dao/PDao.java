package com.navin.dao;
import org.springframework.stereotype.Repository;

@Repository
public class PDao {

    public void addProduct(){
        System.out.println("Add Dao");
    }
    public void removeProduct(){
        System.out.println("Remove Dao");
    }

}
