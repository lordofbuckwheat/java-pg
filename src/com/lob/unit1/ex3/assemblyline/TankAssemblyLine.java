package com.lob.unit1.ex3.assemblyline;

import com.lob.unit1.ex3.assemblyline.step.ILineStep;
import com.lob.unit1.ex3.product.IProduct;
import com.lob.unit1.ex3.assemblyline.step.TankEngineLineStep;
import com.lob.unit1.ex3.assemblyline.step.TankHullLineStep;
import com.lob.unit1.ex3.assemblyline.step.TankTurretLineStep;

public class TankAssemblyLine implements IAssemblyLine {

  private TankHullLineStep stepOne;
  private TankEngineLineStep stepTwo;
  private TankTurretLineStep stepThree;

  public TankAssemblyLine(ILineStep firstStep, ILineStep secondStep, ILineStep thirdStep) {
    this.stepOne = (TankHullLineStep) firstStep;
    this.stepTwo = (TankEngineLineStep) secondStep;
    this.stepThree = (TankTurretLineStep) thirdStep;
    System.out.println("assembly line created");
  }

  @Override
  public IProduct assembleProduct(IProduct product) {
    product.installFirstPart(this.stepOne.buildProductPart());
    product.installSecondPart(this.stepTwo.buildProductPart());
    product.installThirdPart(this.stepThree.buildProductPart());
    System.out.println("product assembled");
    return product;
  }

}
