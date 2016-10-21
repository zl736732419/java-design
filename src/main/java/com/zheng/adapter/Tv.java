package com.zheng.adapter;

/**
 * Created by zhenglian on 2016/10/21.
 */
public class Tv implements TwoElectricOutlet {
    private String name;

    public Tv(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void connectElectric() {
        System.out.println(name + " connect two outlet electric...");
    }
}
