package com.zheng.composite;

import com.google.common.base.Throwables;

/**
 * Created by zhenglian on 2016/10/30.
 */
public class SingleBox implements IBox {

    public void process() {
        //这里处理自己的业务逻辑
        System.out.println("我是单一box");
    }

    public void add(IBox box) {
        Throwables.propagate(new RuntimeException("单一box无法添加其他box"));
    }

    public void remove(IBox box) {
        Throwables.propagate(new RuntimeException("单一box无法添加其他box"));
    }

    public boolean isLeaf() {
        return true;
    }
}
