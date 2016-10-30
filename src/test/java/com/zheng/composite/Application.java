package com.zheng.composite;

import org.junit.Test;

/**
 * Created by zhenglian on 2016/10/30.
 */
public class Application {
    @Test
    public void test() {
        IBox box = new SingleBox();
        IBox container = new ContainerBox();
        container.add(box);
        box.process();
        container.process();
    }
}
