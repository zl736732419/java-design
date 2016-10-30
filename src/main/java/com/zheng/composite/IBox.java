package com.zheng.composite;

/**
 * Created by zhenglian on 2016/10/30.
 */
public interface IBox {
    void process();
    void add(IBox box);
    void remove(IBox box);
    boolean isLeaf();
}
