package com.lob.unit1.ex3;

public class TankEngineLineStep implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        return new TankEngine();
    }
}
