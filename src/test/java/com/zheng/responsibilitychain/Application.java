package com.zheng.responsibilitychain;

import org.junit.Test;

/**
 * Created by zhenglian on 2016/10/21.
 */
public class Application {
    @Test
    public void test() {
        BeiJingHandler handler1 = new BeiJingHandler();
        ShangHaiHandler handler2 = new ShangHaiHandler();

        handler1.setHandler(handler2);
        String number = "0987654321";
        handler1.handleRequest(number);

    }
}
