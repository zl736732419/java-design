package com.zheng.decorate;

/**
 * 改造的麻雀
 * 可以比麻雀多飞50米
 * Created by zhenglian on 2016/10/21.
 */
public class SparrowBirdDecorator extends Bird {
    private final int DISTANCE = 50;

    private Bird bird;

    public SparrowBirdDecorator(Bird bird) {
        this.bird = bird;
    }

    public int fly() {
        return bird.fly() + DISTANCE;
    }
}
