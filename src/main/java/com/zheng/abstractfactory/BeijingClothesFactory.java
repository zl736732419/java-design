package com.zheng.abstractfactory;

/**
 * 具体工厂，用于创建北京牌衣服、鞋子
 * Created by zhenglian on 2016/10/23.
 */
public class BeijingClothesFactory extends ClothesAbstractFactory {
    public Trouser getTrouser(int chestSize, int height) {
        return new LeatherTrouser(chestSize, height, "北京牌");
    }

    public UpperClothes getUpperClothes(int chestSize, int height) {
        return new WesternUpperClothes(chestSize, height, "北京牌");
    }
}
