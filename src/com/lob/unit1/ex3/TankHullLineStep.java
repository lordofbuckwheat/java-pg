package com.lob.unit1.ex3;

public class TankHullLineStep implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        return new TankHull();
    }
}
