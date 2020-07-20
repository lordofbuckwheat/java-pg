package com.lob.unit1.ex2.product.tv;

import com.lob.unit1.ex2.product.TV;

public class OLED extends TV {

    public OLED(int price, int weight, int size) {
        super(price, weight, size);
    }

    @Override
    protected int getSizeFactor() {
        return 5;
    }

}
