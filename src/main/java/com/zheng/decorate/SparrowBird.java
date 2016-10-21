package com.zheng.decorate;

/**
 * 定义一个麻雀，它可以飞100米
 * 被装饰者
 * Created by zhenglian on 2016/10/21.
 */
public class SparrowBird extends Bird{
    private static final int DISTANCE = 100;

    public int fly() {
        return DISTANCE;
    }
}
