package com.zheng.flyweight;

import org.junit.Test;

/**
 * Created by zhenglian on 2016/10/30.
 */
public class Application {
    @Test
    public void test() {
        double width = 1.82,height=1.47,length=5.12;
        String key = width + "#" + height + "#" + length;
        CarAttr carAttr = CarAttrFactory.getInstance().getCarAttr(key);
        Car blueAodi = new Car("奥迪", "蓝色", carAttr);
        Car redAodi = new Car("奥迪", "红色", carAttr);

        blueAodi.print();
        redAodi.print();

    }
}
