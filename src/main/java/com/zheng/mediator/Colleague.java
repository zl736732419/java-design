package com.zheng.mediator;

import java.util.Map;

/**
 * 抽象同事之间需要实现的方法
 * Created by zhenglian on 2016/10/29.
 */
public interface Colleague {
    void giveMsg(Map<String, String> msgs);
    void recieveMsg(String msg);
    void setName(String name);
    String getName();
}
