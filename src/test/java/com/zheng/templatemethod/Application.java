package com.zheng.templatemethod;

import org.junit.Test;

import java.io.File;

/**
 * Created by zhenglian on 2016/10/30.
 */
public class Application {

    @Test
    public void test() {
        ListDirFile obj = new ModifyDateBasedListDirFile(new File("F:\\work"));
        obj.showFileName();
    }
}
