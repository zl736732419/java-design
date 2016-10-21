package com.zheng.adapter;

import org.junit.Test;

/**
 * Created by zhenglian on 2016/10/21.
 */
public class Application {

    @Test
    public void test() {
        Tv tv = new Tv("电视机");
        tv.connectElectric();

        Washer washer = new Washer("洗衣机");
        washer.connectElectric();

        ThreeToTwoOutletAdapter adapter = new ThreeToTwoOutletAdapter(tv);
        tv.setName("");
        System.out.println("洗衣机接通两相适配器...");
        adapter.connectElectric();


    }

}
