package com.example.demo;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class Config {
   public DataSource getDataSource() {
       DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
       dataSourceBuilder.url("jdbc:mysql://localhost:3306/test?serverTimezone=UTC");
       dataSourceBuilder.username("");
       dataSourceBuilder.password("");
       dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
       return dataSourceBuilder.build();
   }

   @Bean
   public JdbcTemplate getJdbcTemplate() {return new JdbcTemplate((getDataSource()));}

}
