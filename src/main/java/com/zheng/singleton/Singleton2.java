package com.zheng.singleton;

/**
 * 饱和模式
 * 在使用该对象的时候创建该实例对象
 * 没有考虑线程并发的问题
 * Created by zhenglian on 2016/10/18.
 */
public class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if(null == instance) {
            instance = new Singleton2();
        }

        return instance;
    }

}
