package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarApi {
    @Autowired
    Dao dao;
    @GetMapping ("/get/{mark}")
    public Car getCar (@PathVariable String mark){
        return dao.getCar(mark);
    }

    @DeleteMapping ("/delete/{id}")
    public void delete (@PathVariable int id) {
        dao.delete(id);
    }







}
