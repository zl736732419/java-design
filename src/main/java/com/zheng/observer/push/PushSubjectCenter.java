package com.zheng.observer.push;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by zhenglian on 2016/10/21.
 */
public class PushSubjectCenter implements PushSubject {
    private String name;

    public PushSubjectCenter(String name) {
        this.name = name;
    }

    private List<String> msgs = Lists.newArrayList();

    private List<PushObserver> observers = Lists.newArrayList();

    public void addObserver(PushObserver observer) {
        if(!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void delete(PushObserver observer) {
        if(observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    public void notifyAllObservers() {
        for(PushObserver observer : observers) {
            observer.update(getDataStr(msgs));
        }
    }

    private String getDataStr(List<String> list) {
        return Joiner.on(",").skipNulls().join(list);
    }

    /**
     * 发布消息
     * 每一次发布消息都会通知监听者前来更新
     * @param msg
     */
    public void publishMsg(String msg) {
        System.out.println(name + " publish msg: " + msg);
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
