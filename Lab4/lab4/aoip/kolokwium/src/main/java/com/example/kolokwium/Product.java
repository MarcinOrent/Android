package com.example.kolokwium;

public class Product {

    private Long id;
    private String product;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + product + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return product;
    }

    public void setName(String product) {
        this.product = product;
    }

    public Product() {
    }

    public Product(Long id, String name) {
        this.id = id;
        this.product = product;
    }
}
