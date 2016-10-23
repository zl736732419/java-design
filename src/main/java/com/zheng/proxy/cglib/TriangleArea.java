package com.zheng.proxy.cglib;

/**
 * Created by zhenglian on 2016/10/23.
 */
public class TriangleArea extends ShapeArea {
    private double sideA;
    private double sideB;
    private double sideC;

    public TriangleArea(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getArea() {
        double p = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }
}
