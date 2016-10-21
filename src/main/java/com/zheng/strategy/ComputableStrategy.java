package com.zheng.strategy;

import java.util.List;

/**
 * 计算分数的抽象类
 * 用于抽象计算分数的实现
 * Created by zhenglian on 2016/10/21.
 */
public interface ComputableStrategy {
    /**
     * 计算分数抽象接口
     * 这里可以有多种计算分数的算法
     * 1.计算总分
     * 2.计算平均分
     * 3.计算标准差
     * ...
     * @param scores
     * @return
     */
    float computeScore(List<Integer> scores);
}
