package com.lob.unit1.ex3;

public class TankTurretLineStep implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        return new TankTurret();
    }
}
