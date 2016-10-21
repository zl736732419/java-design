package com.zheng.observer.push;

/**
 * 观察者获取数据接口
 * Created by zhenglian on 2016/10/21.
 */
public interface PushObserver {
    void update(String msg);
}
