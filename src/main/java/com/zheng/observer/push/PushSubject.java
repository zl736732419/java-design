package com.zheng.observer.push;

/**
 * 推模型消息中心
 * Created by zhenglian on 2016/10/21.
 */
public interface PushSubject {

    /**
     * 添加监听器
     * @param observer
     */
    void addObserver(PushObserver observer);

    /**
     * 删除监听器
     * @param observer
     */
    void delete(PushObserver observer);

    /**
     * 通知监听器消息改变
     */
    void notifyAllObservers();

}
