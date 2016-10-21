package com.zheng.strategy;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * Created by zhenglian on 2016/10/21.
 */
public class Application {
    @Test
    public void test() {
        List<Integer> scores = Lists.newArrayList(1,2,3,4,5,6,7,8,9);
        TotalScoreStrategy totalScoreStrategy = new TotalScoreStrategy();
        System.out.println("总分为：" + totalScoreStrategy.computeScore(scores));
        
        AverageScoreStrategy averageScoreStrategy = new AverageScoreStrategy();
        System.out.println("平均分为：" + averageScoreStrategy.computeScore(scores));
    }
}
