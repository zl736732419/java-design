package com.zheng.flyweight;

/**
 * Created by zhenglian on 2016/10/30.
 */
public class Car {
    private String name;
    private String color;
    private CarAttr carAttr;

    public Car(String name, String color, CarAttr carAttr) {
        this.name = name;
        this.color = color;
        this.carAttr = carAttr;
    }

    public void print() {
        System.out.println("名称:" + name);
        System.out.println("颜色:" + color);
        System.out.println("宽度：" + carAttr.getWidth());
        System.out.println("高度：" + carAttr.getHeight());
        System.out.println("长度：" + carAttr.getLength());
    }
}
