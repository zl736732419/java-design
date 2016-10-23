package com.zheng.proxy.cglib;

import org.junit.Test;

/**
 * Created by zhenglian on 2016/10/23.
 */
public class Application {

    @Test
    public void test() {
        TriangleArea triangleArea = new TriangleArea(3d, 4d, 5d);
        ShapeArea area = (ShapeArea) ShapeProxyFactory.getInstance().getProxy(triangleArea);
        double result = area.getArea();
        System.out.println("result: " + result);
    }
}
