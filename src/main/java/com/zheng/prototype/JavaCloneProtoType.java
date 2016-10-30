package com.zheng.prototype;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by zhenglian on 2016/10/30.
 */
public class JavaCloneProtoType implements Cloneable {
    private List<String> lists = Lists.newArrayList();
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        JavaCloneProtoType clone = (JavaCloneProtoType) super.clone();
        clone.lists = Lists.newArrayList();
        clone.lists.addAll(lists);
        return clone;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
