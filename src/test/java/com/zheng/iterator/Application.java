package com.zheng.iterator;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * Created by zhenglian on 2016/10/29.
 */
public class Application {
    @Test
    public void test() {
        List<Integer> data = Lists.newArrayList(1,2,3,4,5,6,7);
        DataTask task = new LoadDataTask(data);
        while(task.hasNext()) {
            System.out.println(task.next());
        }

    }
}
