package com.zheng.singleton;

import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.HashSet;

/**
 * Created by zhenglian on 2016/10/18.
 */
public class Application {
    
    @Test
    public void singleton1(){
        System.out.println(Singleton1.getInstance());
        System.out.println(Singleton1.getInstance());
    }

    @Test
    public void singleton2(){
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton2.getInstance());
    }

    @Test
    public void singleton2Thread() throws Exception {
        final HashSet<Singleton2> set = Sets.newHashSet();

        for(int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                public void run() {
                    Singleton2 instance = Singleton2.getInstance();
                    set.add(instance);
                }
            }).start();
        }

        while(true) {
            Thread.sleep(1000);
            System.out.println(set.size());
            System.out.println(set);

            //2
            //[om.zheng.singleton.Singleton2@52fad2a1, com.zheng.singleton.Singleton2@511a7296]

        }
    }

    @Test
    public void singleton3() throws Exception {
        final HashSet<Singleton3> set = Sets.newHashSet();

        for(int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                public void run() {
                    Singleton3 instance = Singleton3.getInstance();
                    set.add(instance);
                }
            }).start();
        }

        while(true) {
            Thread.sleep(1000);
            System.out.println(set.size());
            System.out.println(set);
        }
    }



}
