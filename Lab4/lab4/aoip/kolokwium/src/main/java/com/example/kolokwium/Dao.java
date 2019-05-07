package com.example.kolokwium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;



@Repository
public class Dao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public Dao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public Product getProduct( String product){
        List<Product> products=  jdbcTemplate.query("SELECT * FROM PRODUCT WHERE product='"+product+"';",new BeanPropertyRowMapper<>(Product.class));

        return products.get(0);
    }


}
