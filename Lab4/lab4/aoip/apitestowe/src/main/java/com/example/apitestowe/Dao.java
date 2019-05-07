package com.example.apitestowe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class Dao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public Dao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Car car) {
        String sql = "INSERT INTO Car VALUES(?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                car.getId(),
                car.getMark(),
                car.getModel(),
                car.getColor()
        });
    }
    public List<Map<String, Object>> showByMark(String mark) {
        String sql = "SELECT * FROM car WHERE mark LIKE ?";
        //  jdbcTemplate.queryForList(sql,Car.class);
        return jdbcTemplate.queryForList(sql, new Object[]{mark});
    }
    public Car getCar(int id){
      List<Car> cars=  jdbcTemplate.query("SELECT * FROM CAR WHERE car_id='"+id+"';",new BeanPropertyRowMapper<>(Car.class));

      return cars.get(0);
    }
    public void delete(String mark) {
        String sql = "DELETE FROM car WHERE mark = '"+mark+"';";
         jdbcTemplate.update(sql);

    }




// dodawanie przy uruchomieniu
    @EventListener(ApplicationReadyEvent.class)
    public void dbInit() {
        save(new Car((long) 1, "Enzo", "Ferrari", "red"));
    }
}
