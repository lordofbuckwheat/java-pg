package com.lob.unit1.ex3.product;

import com.lob.unit1.ex3.product.part.IProductPart;
import com.lob.unit1.ex3.product.part.TankEngine;
import com.lob.unit1.ex3.product.part.TankHull;
import com.lob.unit1.ex3.product.part.TankTurret;

public class Tank implements IProduct {

  private TankHull hull;
  private TankEngine engine;
  private TankTurret turret;

  @Override
  public void installFirstPart(IProductPart part) {
    this.hull = (TankHull) part;
    System.out.println("hull installed");
  }

  @Override
  public void installSecondPart(IProductPart part) {
    this.engine = (TankEngine) part;
    System.out.println("engine installed");
  }

  @Override
  public void installThirdPart(IProductPart part) {
    this.turret = (TankTurret) part;
    System.out.println("turret installed");
  }

}
