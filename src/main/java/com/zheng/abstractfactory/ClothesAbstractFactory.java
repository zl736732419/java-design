package com.zheng.abstractfactory;

/**
 * 抽象工厂意在创建一个产品系列，
 * 它针对的是面向多个产品等级结构的
 * 当发现存在一组接口有多种实现，则可以考虑用抽象工厂模式
 * 
 * Created by zhenglian on 2016/10/23.
 */
public abstract class ClothesAbstractFactory {
    public abstract Trouser getTrouser(int chestSize, int height);
    public abstract UpperClothes getUpperClothes(int chestSize, int height);
}
