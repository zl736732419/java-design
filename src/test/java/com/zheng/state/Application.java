package com.zheng.state;

import org.junit.Test;

/**
 * Created by zhenglian on 2016/10/21.
 */
public class Application {
    @Test
    public void test() {
        String user = "zhang";
        String item = "老王当班长";
        VoteManager manager = new VoteManager();
        manager.vote(user, item);
        manager.vote(user, item);
        manager.vote(user, item);
        manager.vote(user, item);
        manager.vote(user, item);
        manager.vote(user, item);
        manager.vote(user, item);
        manager.vote(user, item);
        manager.vote(user, item);

    }
}
