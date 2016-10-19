package com.zheng.observer.pull;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 主题中心
 * Created by zhenglian on 2016/10/19.
 */
public class PullSubjectCenter implements PullSubject {
    private String name;
    /**
     * 这里相当于是一个消息列表，当有消息产生时，将会添加在第一位
     * 默认设置只保留10条记录
     */
    private List<String> msgs = Lists.newArrayList();

    public PullSubjectCenter(String name) {
        this.name = name;
    }

    private List<PullObserver> observers = Lists.newArrayList();

    public void addObserver(PullObserver observer) {
        if(!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void delete(PullObserver observer) {
        if(!observers.contains(observer)) {
            return;
        }

        observers.remove(observer);
    }

    /**
     * 通知监听者前来获取数据
     */
    public void notifyAllObservers() {
        for(PullObserver observer : observers) {
            observer.update();
        }
    }

    /**
     * 发布消息
     * 每一次发布消息都会通知监听者前来更新
     * @param msg
     */
    public void publishMsg(String msg) {
        if(msgs.size() == 10) {
            msgs.remove(msgs.size() - 1); //移除第10条记录
        }

        msgs.add(0, msg);
        this.notifyAllObservers();
    }

    public List<String> getMsgs() {
        return msgs;
    }

    public void setMsgs(List<String> msgs) {
        this.msgs = msgs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
