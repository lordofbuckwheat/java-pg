package com.lob.unit1.ex3.assemblyline.step;

import com.lob.unit1.ex3.product.part.IProductPart;
import com.lob.unit1.ex3.product.part.TankEngine;

public class TankEngineLineStep implements ILineStep {

  @Override
  public IProductPart buildProductPart() {
    return new TankEngine();
  }

}
