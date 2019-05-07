package com.example.kolokwium;

import org.atmosphere.config.service.Get;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class ProductApi {
@Autowired
    Dao dao;

    @GetMapping ("/getProduct/{product}")
    public Product getProduct(@PathVariable  String product){
        return dao.getProduct(product);

    }



}
