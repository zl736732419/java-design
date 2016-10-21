package com.zheng.state;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 模拟用户投票，这里是投票管理中心
 * 所有用户都只能投一次票，1<count<5表示重复投票，投票次数>5表示恶意投票 投票次数>8进入黑名单
 * Created by zhenglian on 2016/10/21.
 */
public class VoteManager {
    private VoteState state = null;

    /**
     * 记录正常的投票
     */
    private Map<String, Object> votes = Maps.newHashMap();

    /**
     * 记录每一个用户投票次数
     */
    private Map<String, Integer> voteCounts = Maps.newHashMap();

    public Map<String, Object> getVotes() {
        return votes;
    }

    /**
     * 投票接口
     * @param user
     * @param item
     */
    public void vote(String user, String item) {
        Integer count = voteCounts.get(user);

        if(count == null) {
            state = new NormalVoteState();
            count = 0;
        }else if(count >= 1 && count < 5) {
            state = new RepeatVoteState();
        }else if(count >= 5 && count < 8) {
            state = new SpiteVoteState();
        }else {
            state = new BlackVoteState();
        }

        voteCounts.put(user, ++count);
        state.vote(user, item, this);
    }
}
