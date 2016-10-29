package com.zheng.mediator;

import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Map;

/**
 * Created by zhenglian on 2016/10/29.
 */
public class Application {
    @Test
    public void test() {
        ColleagueMediator mediator = new ColleagueMediator();

        Colleague colleague1 = new Colleague1("小张", mediator);
        Colleague colleague2 = new Colleague2("小李", mediator);
        Colleague colleague3 = new Colleague3("小王", mediator);

        mediator.registorColleague(colleague1);
        mediator.registorColleague(colleague2);
        mediator.registorColleague(colleague3);

        Map<String, String> msgs = Maps.newHashMap();
        msgs.put("小李", "麻烦给我递一下文件,thx!");
        colleague1.giveMsg(msgs);

        msgs = Maps.newHashMap();
        msgs.put(null, "所有人到会议室开会!");
        colleague2.giveMsg(msgs);

        msgs = Maps.newHashMap();
        msgs.put("小张", "李主任叫我们去会议室开会，你快过来");
        colleague3.giveMsg(msgs);
    }

}
