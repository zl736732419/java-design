package com.zheng.state;

/**
 * Created by zhenglian on 2016/10/21.
 */
public class NormalVoteState implements VoteState {
    public void vote(String user, String item, VoteManager manager) {
        manager.getVotes().put(user, item);
        System.out.println("祝贺，投票成功!");
    }
}
