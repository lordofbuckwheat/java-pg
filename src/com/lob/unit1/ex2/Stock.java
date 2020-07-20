package com.lob.unit1.ex2;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private final int capacity;
    private final List<Product> products = new ArrayList<>();

    public Stock(int capacity) {
        this.capacity = capacity;
    }

    public boolean place(Product product) {
        if (product.getSize() > this.emptySpace()) {
            return false;
        }
        this.products.add(product);
        return true;
    }

    private int emptySpace() {
        return this.capacity - this.products.stream().mapToInt(Product::getSize).reduce(Integer::sum).orElse(0);
    }

    public int summaryWeight() {
        return this.products.stream().mapToInt(Product::getWeight).reduce(Integer::sum).orElse(0);
    }

    public int summaryPrice() {
        return this.products.stream().mapToInt(Product::getPrice).reduce(Integer::sum).orElse(0);
    }

}
