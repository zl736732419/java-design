package com.zheng.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * cglib proxy factory
 * Created by zhenglian on 2016/10/23.
 */
public class ShapeProxyFactory {
    private ShapeProxyFactory() {
    }

    private static class Nested {
        public static ShapeProxyFactory FACTORY = new ShapeProxyFactory();
    }

    public Object getProxy(Object proxied) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(proxied.getClass().getSuperclass());
        enhancer.setClassLoader(proxied.getClass().getClassLoader());
        enhancer.setCallback(new ShapeInvocationHandler(proxied));
        return enhancer.create();
    }

    class ShapeInvocationHandler implements InvocationHandler {
        private Object proxied;

        public ShapeInvocationHandler(Object proxied) {
            this.proxied = proxied;
        }

        public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
            return method.invoke(proxied, objects);
        }
    }

    public static ShapeProxyFactory getInstance() {
        return Nested.FACTORY;
    }
}
