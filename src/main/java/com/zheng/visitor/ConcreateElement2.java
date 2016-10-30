package com.zheng.visitor;

/**
 * Created by zhenglian on 2016/10/30.
 */
public class ConcreateElement2 implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void doSomeThing() {
        System.out.println("concreate element2 ");
    }
}
