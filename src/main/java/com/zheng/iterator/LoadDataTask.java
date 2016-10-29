package com.zheng.iterator;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by zhenglian on 2016/10/29.
 */
public class LoadDataTask<T> implements DataTask {
    private List<T> data = Lists.newArrayList();
    private int totalNum;
    private T cur;
    private int curIndex;

    public LoadDataTask(List<T> data) {
        this.data = data;
    }

    public <T> T next() {
        return (T) cur;
    }

    public boolean hasNext() {
        try {
            cur = data.get(curIndex++);
            return true;
        }catch(Exception e) {
        }
        return false;
    }
}
