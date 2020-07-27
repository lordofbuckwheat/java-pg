package com.lob.unit1.ex2.product.computer;

public class Laptop extends AbstractComputer {

  public Laptop(int price, int weight, int size) {
    super(price, weight, size);
  }

  @Override
  protected int getSizeFactor() {
    return 2;
  }

}
