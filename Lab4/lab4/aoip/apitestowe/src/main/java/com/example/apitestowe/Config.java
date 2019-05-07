package com.example.apitestowe;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class Config {
    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/test?serverTimezone=UTC");
        dataSourceBuilder.username("");
        dataSourceBuilder.password("");
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");


        return dataSourceBuilder.build();
    }
    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }


// dodawanie przy uruchomieniu
    @EventListener(ApplicationReadyEvent.class)
    public void dbInit() {


    }
}

