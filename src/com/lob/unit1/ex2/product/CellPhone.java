package com.lob.unit1.ex2.product;

public class CellPhone extends AbstractProduct {

  public CellPhone(int price, int weight, int size) {
    super(price, weight, size);
  }

  @Override
  protected int getSizeFactor() {
    return 1;
  }

}
