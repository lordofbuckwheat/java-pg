package com.lob.hotel.hotel.model.service;

public abstract class AbstractService {

  private int price;

  public AbstractService(int price) {
    this.price = price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

}
