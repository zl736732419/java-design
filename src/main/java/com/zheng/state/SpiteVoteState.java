package com.zheng.state;

/**
 * 恶意投票
 * 取消用户所投的票
 * Created by zhenglian on 2016/10/21.
 */
public class SpiteVoteState implements VoteState {
    public void vote(String user, String item, VoteManager manager) {
        manager.getVotes().remove(user);
        System.out.println("你存在恶意投票操作，你所投的票将被视为无效！");
    }
}
