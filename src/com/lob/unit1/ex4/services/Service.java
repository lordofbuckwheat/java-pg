package com.lob.unit1.ex4.services;

public abstract class Service {
    private int price;

    public Service(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
