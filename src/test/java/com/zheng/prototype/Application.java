package com.zheng.prototype;

import org.junit.Test;

/**
 * Created by zhenglian on 2016/10/30.
 */
public class Application {
    @Test
    public void testClone() throws CloneNotSupportedException {
        JavaCloneProtoType obj = new JavaCloneProtoType();
        for(int i = 1; i <= 10; i++) {
            obj.getLists().add(i+"");
        }

        JavaCloneProtoType clone = (JavaCloneProtoType) obj.clone();
        obj.getLists().remove(0);

        System.out.println(obj.getLists());
        System.out.println(clone.getLists());
    }

    @Test
    public void testObjStream() throws CloneNotSupportedException {
        JavaObjStreamProtoType obj = new JavaObjStreamProtoType();
        for(int i = 1; i <= 10; i++) {
            obj.getLists().add(i+"");
        }

        JavaObjStreamProtoType clone = (JavaObjStreamProtoType) obj.clone();
        obj.getLists().remove(0);

        System.out.println(obj.getLists());
        System.out.println(clone.getLists());
    }
}
