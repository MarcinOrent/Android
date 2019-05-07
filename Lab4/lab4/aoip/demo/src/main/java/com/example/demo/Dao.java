package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public class Dao {
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public Dao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public Car getCar(String mark){
        List<Car> cars=  jdbcTemplate.query("SELECT * FROM CAR WHERE mark='"+mark+"';",new BeanPropertyRowMapper<>(Car.class));

        return cars.get(0);
    }

    public void delete(int id) {
        String sql = "DELETE FROM car WHERE car_id = '"+id+"';";
        jdbcTemplate.update(sql);
    }


}
