package com.zheng.facade;

/**
 * 计算广告费用
 * Created by zhenglian on 2016/10/29.
 */
public class Charge {
    private static final int charge = 12;//一个字12元
    private CheckWord checkWord;

    public Charge(CheckWord checkWord) {
        this.checkWord = checkWord;
    }

    public int getCharge() {
        int money = checkWord.getWordCount() * charge;
        System.out.println("当前广告费为：" + money);
        return money;
    }
}
