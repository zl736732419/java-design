package com.zheng.observer.pull;

/**
 * 拉模式获取数据监听者接口
 * Created by zhenglian on 2016/10/19.
 */
public interface PullObserver {
    /**
     * 主题更新数据后调用监听者该方法，用于告知监听者数据发生改变，需要监听者确认并更新数据
     */
    void update();
}
