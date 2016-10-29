package com.zheng.facade;

import org.junit.Test;

/**
 * Created by zhenglian on 2016/10/29.
 */
public class Application {
    @Test
    public void test() {
        String advertisement = "解放牌洗衣机，方便好用又省钱，你值得拥有";

        AdvertisementFacade facade = new AdvertisementFacade(advertisement);
        facade.doAdvertisement();
    }
}
