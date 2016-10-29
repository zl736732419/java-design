package com.zheng.iterator;

/**
 * 迭代器模式，将对象列表使用方式通过iterator模型进行遍历
 * Created by zhenglian on 2016/10/29.
 */
public interface DataTask {
    public <T> T next();
    public boolean hasNext();
}
