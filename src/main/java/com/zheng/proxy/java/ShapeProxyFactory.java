package com.zheng.proxy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 采用java动态代理
 * Created by zhenglian on 2016/10/23.
 */
public class ShapeProxyFactory {

    private ShapeProxyFactory() {
    }

    private static class Nested {
        public static ShapeProxyFactory FACTORY = new ShapeProxyFactory();
    }

    public Object getProxy(Object proxied, Class<?>[] interfaces) {
        return Proxy.newProxyInstance(ShapeProxyFactory.class.getClassLoader(), interfaces, new ShapeInvocationHandler(proxied));
    }

    class ShapeInvocationHandler implements InvocationHandler {
        private Object proxied;

        public ShapeInvocationHandler(Object proxied) {
            this.proxied = proxied;
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return method.invoke(proxied, args);
        }
    }

    public static ShapeProxyFactory getInstance() {
        return Nested.FACTORY;
    }

}

