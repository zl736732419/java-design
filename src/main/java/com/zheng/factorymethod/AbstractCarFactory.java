package com.zheng.factorymethod;

/**
 * 工厂方法模式针对的是一个产品等级结构
 * 当发现存在一个接口有多种实现的方式，则可以考虑用工厂方法来实现
 * Created by zhenglian on 2016/10/23.
 */
public abstract class AbstractCarFactory {
    public abstract AbstractCar createCar();
}
