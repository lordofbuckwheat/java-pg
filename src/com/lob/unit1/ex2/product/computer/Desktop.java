package com.lob.unit1.ex2.product.computer;

import com.lob.unit1.ex2.product.Computer;

public class Desktop extends Computer {

    public Desktop(int price, int weight, int size) {
        super(price, weight, size);
    }

    @Override
    protected int getSizeFactor() {
        return 3;
    }

}
