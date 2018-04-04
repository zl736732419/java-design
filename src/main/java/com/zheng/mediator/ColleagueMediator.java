package com.zheng.mediator;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * 具体中介者
 * Created by zhenglian on 2016/10/29.
 */
public class ColleagueMediator  {
    List<Colleague> colleagues = Lists.newArrayList();

    public void registorColleague(Colleague colleague) {
        if(!colleagues.contains(colleague)) {
            colleagues.add(colleague);
        }
    }

    public void deliver(Colleague colleague, Map<String, String> msgs) {
        String name; //同事名称
        String msg; //消息
        for(Map.Entry<String, String> entry : msgs.entrySet()) {
            name = entry.getKey();
            msg = entry.getValue();
            for(Colleague c : colleagues) {
                if(c.getName().equals(colleague.getName())) {
                    continue;
                }
                if(StringUtils.isBlank(name) ||
                        c.getName().equals(name)) { //发给所有人或者消息指定的接受同事
                    c.receiveMsg(msg);
                }
            }
        }
    }
}
