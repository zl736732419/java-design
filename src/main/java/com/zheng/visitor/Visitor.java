package com.zheng.visitor;

/**
 * 访问者接口
 * Created by zhenglian on 2016/10/30.
 */
public interface Visitor {
    void visit(ConcreateElement1 element);
    void visit(ConcreateElement2 element);
}
