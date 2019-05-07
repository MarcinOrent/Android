package com.example.apitestowe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarApi {


@Autowired
Dao dao;
    @GetMapping ("/get/{mark}")
    public List getCar(@PathVariable  String mark){
        return dao.showByMark(mark);

    }
    @GetMapping ("/getCar/{id}")
    public Car getCar(@PathVariable  int id){
        return dao.getCar(id);

    }
    @DeleteMapping("/delete/{mark}")
    public void DeleteCar (@PathVariable String mark) {
        dao.delete(mark);
    }
    @PostMapping("/save")
    public void addCar(@RequestBody Car car) {
        dao.save(car);
    }

}
