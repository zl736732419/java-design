package com.zheng.factorymethod;

import org.junit.Test;

/**
 * Created by zhenglian on 2016/10/23.
 */
public class Application {
    @Test
    public void test() {
        AbstractCarFactory factory = new HongQiCarFactory();
        HongQiCar car = (HongQiCar) factory.createCar();
        car.start();
        car.turn();
        car.stop();
    }
}
