package com.zheng.singleton;

/**
 * 饱和模式，并且线程并发安全
 * Created by zhenglian on 2016/10/18.
 */
public class Singleton3_1 {

    private volatile static Singleton3_1 instance = null;

    private Singleton3_1() {

    }

    public static Singleton3_1 getInstance() {
        if (null == instance) {
            synchronized (Singleton3_1.class) {
                if (null == instance) { //再次判断，确保对象已经被实例化
                    instance = new Singleton3_1();
                }
            }
        }

        return instance;
    }
}
