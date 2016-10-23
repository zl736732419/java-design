package com.zheng.factorymethod;

/**
 * Created by zhenglian on 2016/10/23.
 */
public class HongQiCar extends AbstractCar {
    public void start() {
        System.out.println("hongqi car start...");
    }

    public void stop() {
        System.out.println("hongqi car stop...");
    }

    public void turn() {
        System.out.println("hongqi car turn...");
    }
}
