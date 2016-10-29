package com.zheng.facade;

/**
 * 排版广告
 * Created by zhenglian on 2016/10/29.
 */
public class TypeSetting {
    private String advertisement;

    public TypeSetting(String advertisement) {
        this.advertisement = advertisement;
    }

    public void typeSetting() {
        System.out.println("--------------------");
        System.out.println(advertisement);
        System.out.println("--------------------");
    }
}
