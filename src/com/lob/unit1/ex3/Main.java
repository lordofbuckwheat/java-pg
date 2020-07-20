package com.lob.unit1.ex3;

public class Main {

    public static void main(String[] args) {
        AssemblyLine assemblyLine = new AssemblyLine(new TankHullLineStep(), new TankEngineLineStep(), new TankTurretLineStep());
        Tank tank = (Tank) assemblyLine.assembleProduct(new Tank());
    }

}
