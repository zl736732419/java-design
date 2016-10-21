package com.zheng.state;

/**
 * 投票状态
 * 不同状态将对应不同实现
 * Created by zhenglian on 2016/10/21.
 */
public interface VoteState {
    /**
     * 投票
     * @param user
     * @param item
     * @param manager
     */
    void vote(String user, String item, VoteManager manager);
}
