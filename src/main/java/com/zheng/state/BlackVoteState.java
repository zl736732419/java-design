package com.zheng.state;

/**
 * 当前用户被设置为黑名单
 * Created by zhenglian on 2016/10/21.
 */
public class BlackVoteState implements VoteState {
    public void vote(String user, String item, VoteManager manager) {
        System.out.println("由于你的恶意操作，系统已经将你设置为黑名单用户！");
    }
}
