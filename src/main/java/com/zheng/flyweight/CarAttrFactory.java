package com.zheng.flyweight;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 创建享元对象的工厂，保证享元对象唯一
 * Created by zhenglian on 2016/10/30.
 */
public class CarAttrFactory {
    private static CarAttrFactory factory = null;
    private Map<String, CarAttr> attrs = Maps.newHashMap();

    private CarAttrFactory() {
    }

    public static CarAttrFactory getInstance() {
        if(null == factory) {
            factory = new CarAttrFactory();
        }

        return factory;
    }

    public CarAttr getCarAttr(String key) {
        if(attrs.keySet().contains(key)) {
            return attrs.get(key);
        }

        double width = 0, height = 0, length = 0;
        String[] str = key.split("#");
        width = Double.parseDouble(str[0]);
        height = Double.parseDouble(str[1]);
        length = Double.parseDouble(str[2]);

        CarAttr carAttr = new CarAttrImpl(width, height, length);

        attrs.put(key, carAttr);
        return carAttr;

    }


}
