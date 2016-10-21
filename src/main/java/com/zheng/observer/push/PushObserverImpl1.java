package com.zheng.observer.push;

/**
 * Created by zhenglian on 2016/10/21.
 */
public class PushObserverImpl1 implements PushObserver {

    private String name;

    public PushObserverImpl1(String name) {
        this.name = name;
    }

    public void update(String msg) {
        System.out.println(name + " received center data: " + msg);
    }
}
