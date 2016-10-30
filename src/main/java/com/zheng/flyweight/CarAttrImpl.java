package com.zheng.flyweight;

/**
 * Created by zhenglian on 2016/10/30.
 */
public class CarAttrImpl implements CarAttr {
    private double width;
    private double height;
    private double length;

    public CarAttrImpl(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public void printMessage(String msg) {
        System.out.println(msg);
        System.out.println("宽度：" + width);
        System.out.println("高度：" + height);
        System.out.println("长度：" + length);

    }
}
