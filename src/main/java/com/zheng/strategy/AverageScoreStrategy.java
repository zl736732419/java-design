package com.zheng.strategy;

import java.util.List;

/**
 * 计算平均分
 * Created by zhenglian on 2016/10/21.
 */
public class AverageScoreStrategy implements ComputableStrategy {
    private TotalScoreStrategy totalScoreStrategy = new TotalScoreStrategy();
    public float computeScore(List<Integer> scores) {
        float totalScore = totalScoreStrategy.computeScore(scores);
        return totalScore / scores.size();
    }
}
