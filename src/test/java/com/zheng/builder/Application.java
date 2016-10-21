package com.zheng.builder;

import org.junit.Test;

/**
 * Created by zhenglian on 2016/10/21.
 */
public class Application {
    @Test
    public void test() {
        Responser responser = new Responser.Builder()
                .success().message("操作成功！").build();
        System.out.println(responser);

    }
}
