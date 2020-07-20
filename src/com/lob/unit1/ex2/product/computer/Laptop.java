package com.lob.unit1.ex2.product.computer;

import com.lob.unit1.ex2.product.Computer;

public class Laptop extends Computer {

    public Laptop(int price, int weight, int size) {
        super(price, weight, size);
    }

    @Override
    protected int getSizeFactor() {
        return 2;
    }

}
