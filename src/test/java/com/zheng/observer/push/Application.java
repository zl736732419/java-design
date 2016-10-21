package com.zheng.observer.push;

import org.junit.Test;

/**
 * Created by zhenglian on 2016/10/21.
 */
public class Application {

    @Test
    public void test() throws InterruptedException {
        PushSubjectCenter center = new PushSubjectCenter("pushcenter");

        PushObserver observer1 = new PushObserverImpl1("observer1");
        PushObserver observer2 = new PushObserverImpl2("observer2");

        center.addObserver(observer1);
        center.addObserver(observer2);

        for(int i = 0; i < 10; i++) {
            Thread.sleep(100);
            if(i == 5) {
                center.delete(observer1);
            }

            center.publishMsg("" + i);

        }


    }
}
