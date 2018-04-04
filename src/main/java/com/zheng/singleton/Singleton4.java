package com.zheng.singleton;

/**
 * 延长初化占位类
 * 利用静态内部类特性： 只有在调用静态内部类的时候它才会被首次加载
 * @Author zhenglian
 * @Date 2018/4/4 15:30
 */
public class Singleton4 {
    
    private static class SingletonFactory {
        public static Singleton4 instance = new Singleton4();
    }
    
    public static Singleton4 getInstance() {
        return SingletonFactory.instance;
    }
}
