package com.example.apitestowever2;

public class Car {

    public Long id;
    public String model;
    public String mark;
    public String color;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car() {
    }

    public Car(Long id, String model, String mark, String color) {
        this.id = id;
        this.model = model;
        this.mark = mark;
        this.color = color;
    }

}
