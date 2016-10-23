package com.zheng.factorymethod;

/**
 * Created by zhenglian on 2016/10/23.
 */
public class HongQiCarFactory extends AbstractCarFactory {
    public AbstractCar createCar() {
        return new HongQiCar();
    }
}
