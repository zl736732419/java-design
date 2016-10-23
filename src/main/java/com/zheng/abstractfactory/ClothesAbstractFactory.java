package com.zheng.abstractfactory;

/**
 * 抽象工厂，定义创建衣服和鞋子的接口
 * Created by zhenglian on 2016/10/23.
 */
public abstract class ClothesAbstractFactory {
    public abstract Trouser getTrouser(int chestSize, int height);
    public abstract UpperClothes getUpperClothes(int chestSize, int height);
}
