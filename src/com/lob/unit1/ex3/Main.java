package com.lob.unit1.ex3;

import com.lob.unit1.ex3.assemblyline.IAssemblyLine;
import com.lob.unit1.ex3.assemblyline.TankAssemblyLine;
import com.lob.unit1.ex3.assemblyline.step.TankEngineLineStep;
import com.lob.unit1.ex3.assemblyline.step.TankHullLineStep;
import com.lob.unit1.ex3.assemblyline.step.TankTurretLineStep;
import com.lob.unit1.ex3.product.Tank;

public class Main {

    public static void main(String[] args) {
        IAssemblyLine assemblyLine = new TankAssemblyLine(new TankHullLineStep(), new TankEngineLineStep(), new TankTurretLineStep());
        Tank tank = (Tank) assemblyLine.assembleProduct(new Tank());
    }

}
