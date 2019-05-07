package com.example.apitestowever2;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class Rest {

@GetMapping ("/cos/{id}")

    public Car restTemplate (@PathVariable int id) {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<Car> exchange = restTemplate.exchange(
            "http://localhost:8080/getCar/"+id, HttpMethod.GET, HttpEntity.EMPTY, Car.class);
    return exchange.getBody();

}

}
