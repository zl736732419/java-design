package com.zheng.flyweight;

import com.google.common.base.Optional;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 创建享元对象的工厂，保证享元对象唯一
 * Created by zhenglian on 2016/10/30.
 */
public class CarAttrFactory {
    private ConcurrentHashMap attrs = new ConcurrentHashMap();

    private CarAttrFactory() {
    }

    private static class CarAttrFactoryHolder {
        public static CarAttrFactory factory = new CarAttrFactory();
    }

    public static CarAttrFactory getInstance() {
        return CarAttrFactoryHolder.factory;
    }

    public CarAttr getCarAttr(String key) {
        CarAttrImpl carAttr = (CarAttrImpl) attrs.get(key);
        if (Optional.fromNullable(carAttr).isPresent()) {
            return carAttr;
        }

        String[] str = key.split("#");
        double width = Double.parseDouble(str[0]);
        double height = Double.parseDouble(str[1]);
        double length = Double.parseDouble(str[2]);
        carAttr = new CarAttrImpl(width, height, length);
        attrs.putIfAbsent(key, carAttr);
        return carAttr;

    }


}
