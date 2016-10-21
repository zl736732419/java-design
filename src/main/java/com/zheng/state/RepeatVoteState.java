package com.zheng.state;

/**
 * 重复投票
 * Created by zhenglian on 2016/10/21.
 */
public class RepeatVoteState implements VoteState {
    public void vote(String user, String item, VoteManager manager) {
        System.out.println("抱歉，当前投票无效，你已经投过票了！");
    }
}
