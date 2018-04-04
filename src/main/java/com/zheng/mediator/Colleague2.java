package com.zheng.mediator;

import java.util.Map;

/**
 * Created by zhenglian on 2016/10/29.
 */
public class Colleague2 implements Colleague {
    private String name;
    private ColleagueMediator mediator;

    public Colleague2(String name, ColleagueMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void giveMsg(Map<String, String> msgs) {
        mediator.deliver(this, msgs);
    }

    public void receiveMsg(String msg) {
        System.out.println(name + "收到消息：");
        System.out.println(msg);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
