package com.zheng.visitor;

import org.junit.Test;

/**
 * Created by zhenglian on 2016/10/30.
 */
public class Application {
    @Test
    public void test() {
        Visitor visitor = new ConcreateVisitor();
        Element element = new ConcreateElement1();
        element.doSomeThing();
        element.accept(visitor);
        element = new ConcreateElement2();
        element.doSomeThing();
        element.accept(visitor);
    }
}
