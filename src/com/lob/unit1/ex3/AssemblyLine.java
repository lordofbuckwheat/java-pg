package com.lob.unit1.ex3;

public class AssemblyLine implements IAssemblyLine {
    private final ILineStep[] steps = new ILineStep[3];

    public AssemblyLine(ILineStep firstStep, ILineStep secondStep, ILineStep thirdStep) {
        this.steps[0] = firstStep;
        this.steps[1] = secondStep;
        this.steps[2] = thirdStep;
        System.out.println("assembly line created");
    }

    @Override
    public IProduct assembleProduct(IProduct product) {
        product.installFirstPart(this.steps[0].buildProductPart());
        product.installSecondPart(this.steps[1].buildProductPart());
        product.installThirdPart(this.steps[2].buildProductPart());
        System.out.println("product assembled");
        return product;
    }
}
