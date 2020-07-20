package com.lob.unit1.ex2.product.tv;

import com.lob.unit1.ex2.product.TV;

public class PDP extends TV {

    public PDP(int price, int weight, int size) {
        super(price, weight, size);
    }

    @Override
    protected int getSizeFactor() {
        return 6;
    }

}
