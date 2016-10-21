package com.zheng.decorate;

import org.junit.Test;

/**
 * Created by zhenglian on 2016/10/21.
 */
public class Application {
    @Test
    public void test() {
        Bird bird = new SparrowBird();
        System.out.println("sparrow bird fly " + bird.fly());

        SparrowBirdDecorator decorateBird = new SparrowBirdDecorator(bird);
        System.out.println("decorate bird fly " + decorateBird.fly());
        
        SparrowBirdDecorator decorateBird2 = new SparrowBirdDecorator(decorateBird);
        System.out.println(" better decorate bird fly " + decorateBird2.fly());


    }
}
