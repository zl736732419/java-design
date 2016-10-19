package com.zheng.observer.pull;

/**
 * 拉模式主题中心接口
 * 定义注册监听器，删除监听器，通知监听器方法接口
 * Created by zhenglian on 2016/10/19.
 */
public interface PullSubject {
    /**
     * 添加监听器
     * @param observer
     */
    void addObserver(PullObserver observer);

    /**
     * 删除监听器
     * @param observer
     */
    void delete(PullObserver observer);

    /**
     * 通知监听器消息改变
     */
    void notifyAllObservers();
}
