package com.lob.unit1.ex3.assemblyline.step;

import com.lob.unit1.ex3.product.part.IProductPart;
import com.lob.unit1.ex3.product.part.TankHull;

public class TankHullLineStep implements ILineStep {

  @Override
  public IProductPart buildProductPart() {
    return new TankHull();
  }

}
