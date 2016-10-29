package com.zheng.facade;

/**
 * 计算广告字数
 * Created by zhenglian on 2016/10/29.
 */
public class CheckWord {
    private String advertisement;
    private static final int basicAmount = 85;

    public CheckWord(String advertisement) {
        this.advertisement = advertisement;
    }

    public int getWordCount() {
        int count = advertisement.length() + basicAmount;
        System.out.println("当前广告字数为：" + count);
        return count;
    }

}
