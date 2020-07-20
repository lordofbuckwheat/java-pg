package com.lob.unit1.ex2.product;

import com.lob.unit1.ex2.Product;

public class CellPhone extends Product {

    public CellPhone(int price, int weight, int size) {
        super(price, weight, size);
    }

    @Override
    protected int getSizeFactor() {
        return 1;
    }

}
