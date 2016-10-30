package com.zheng.visitor;

/**
 * 抽象元素
 * Created by zhenglian on 2016/10/30.
 */
public interface Element {
    /**
     * 需要动态增加的逻辑方法，通过不同的访问者来实现
     * @param visitor
     */
    void accept(Visitor visitor);

    /**
     * 元素本类的方法
     */
    void doSomeThing();
}