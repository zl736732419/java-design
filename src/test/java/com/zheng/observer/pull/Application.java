package com.zheng.observer.pull;

import org.junit.Test;

import java.util.Random;

/**
 * Created by zhenglian on 2016/10/19.
 */
public class Application {

    @Test
    public void test() throws Exception {
        PullSubjectCenter center = new PullSubjectCenter("pull center");
        PullObserver observer1 = new PullObserverImpl1("pull observer1", center);
        PullObserver observer2 = new PullObserverImpl2("pull observer2", center);

        center.addObserver(observer1);
        center.addObserver(observer2);

        for(int i  = 0; i < 20; i++) {
            if(i == 10) {
                center.delete(observer2);
            }
            center.publishMsg(new Random().nextInt(20)+"");
            Thread.sleep(500);
        }
    }
}
