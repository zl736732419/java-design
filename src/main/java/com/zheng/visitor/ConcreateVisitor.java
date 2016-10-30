package com.zheng.visitor;

/**
 * Created by zhenglian on 2016/10/30.
 */
public class ConcreateVisitor implements Visitor {
    public void visit(ConcreateElement1 element) {
        //添加新的类业务逻辑
        element.doSomeThing();
    }

    public void visit(ConcreateElement2 element) {
        //添加新的类业务逻辑
        element.doSomeThing();
    }
}
