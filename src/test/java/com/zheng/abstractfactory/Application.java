package com.zheng.abstractfactory;

import org.junit.Test;

/**
 * Created by zhenglian on 2016/10/23.
 */
public class Application {

    @Test
    public void test() {
        BeijingClothesFactory factory = new BeijingClothesFactory();
        LeatherTrouser trouser = (LeatherTrouser) factory.getTrouser(42, 173);
        WesternUpperClothes clothes = (WesternUpperClothes) factory.getUpperClothes(173, 173);

        System.out.println(trouser);
        System.out.println(clothes);


    }
}
