package com.zheng.proxy.java;

import org.junit.Test;

/**
 * Created by zhenglian on 2016/10/23.
 */
public class Application {

    @Test
    public void test() {
        TriangleArea area = new TriangleArea(3d, 4d, 5d);
        ShapeArea proxy = (ShapeArea) ShapeProxyFactory.getInstance()
                .getProxy(area, area.getClass().getInterfaces());
        double result = proxy.getArea();
        System.out.println("area: " + result);
    }

}
