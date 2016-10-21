package com.zheng.strategy;

import java.util.List;

/**
 * 计算总分
 * Created by zhenglian on 2016/10/21.
 */
public class TotalScoreStrategy implements ComputableStrategy {
    public float computeScore(List<Integer> scores) {
        float total = 0f;
        for(int score : scores) {
            total += score;
        }
        return total;
    }
}
