package com.lob.unit1.ex2.product.tv;

public class Pdp extends AbstractTv {

  public Pdp(int price, int weight, int size) {
    super(price, weight, size);
  }

  @Override
  protected int getSizeFactor() {
    return 6;
  }

}
