package com.lob.unit1.ex3.assemblyline.step;

import com.lob.unit1.ex3.product.part.IProductPart;
import com.lob.unit1.ex3.product.part.TankTurret;

public class TankTurretLineStep implements ILineStep {

  @Override
  public IProductPart buildProductPart() {
    return new TankTurret();
  }

}
