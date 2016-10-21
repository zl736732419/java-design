package com.zheng.adapter;

/**
 * Created by zhenglian on 2016/10/21.
 */
public class Washer implements ThreeElectricOutlet {
    private String name;

    public Washer(String name) {
        this.name = name;
    }

    public void connectElectric() {
        System.out.println(name + " connect three outlet electric...");
    }
}
