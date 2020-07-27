package com.lob.unit1.ex2.product;

public abstract class AbstractProduct {

  private final int price;
  private final int weight;
  private final int size;

  public AbstractProduct(int price, int weight, int size) {
    this.price = price;
    this.weight = weight;
    this.size = size;
  }

  public int getPrice() {
    return this.price;
  }

  public int getSize() {
    return this.size * this.getSizeFactor();
  }

  public int getWeight() {
    return this.weight * this.getSizeFactor();
  }

  protected abstract int getSizeFactor();

}
