package com.lob.unit1.ex2.stock;

import com.lob.unit1.ex2.product.AbstractProduct;
import java.util.ArrayList;
import java.util.List;

public class Stock {

  private final int capacity;
  private final List<AbstractProduct> products = new ArrayList<>();

  public Stock(int capacity) {
    this.capacity = capacity;
  }

  public void place(AbstractProduct product) throws OutOfSpaceException {
    if (product.getSize() > this.emptySpace()) {
      throw new OutOfSpaceException();
    }
    this.products.add(product);
  }

  public int summaryWeight() {
    return this.products.stream().mapToInt(AbstractProduct::getWeight).reduce(Integer::sum)
        .orElse(0);
  }

  public int summaryPrice() {
    return this.products.stream().mapToInt(AbstractProduct::getPrice).reduce(Integer::sum)
        .orElse(0);
  }

  private int emptySpace() {
    return this.capacity - this.products.stream().mapToInt(AbstractProduct::getSize)
        .reduce(Integer::sum)
        .orElse(0);
  }

}
