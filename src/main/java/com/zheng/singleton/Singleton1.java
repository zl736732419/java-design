package com.zheng.singleton;

/**
 * 饥寒单例模式
 * 在定义实例对象的时候就直接创建该对象
 * Created by zhenglian on 2016/10/18.
 */
public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
