package com.zheng.singleton;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 饱和模式，并且线程并发安全
 * Created by zhenglian on 2016/10/18.
 */
public class Singleton3 {

    private volatile static Singleton3 instance = null;
    private static ReadWriteLock lock = new ReentrantReadWriteLock();

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        lock.readLock().lock();
        try {
            if(null == instance) {
                lock.readLock().unlock();
                lock.writeLock().lock();
                try {
                    if(null == instance) { //再次判断，确保对象已经被实例化
                        instance = new Singleton3();
                    }
                }finally {
                    lock.readLock().lock();
                    lock.writeLock().unlock();//更新锁，锁级别降级
                }
            }
        }finally {
            lock.readLock().unlock();
        }

        return instance;
    }


}
