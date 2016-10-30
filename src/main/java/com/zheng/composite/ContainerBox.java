package com.zheng.composite;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.List;

/**
 * Created by zhenglian on 2016/10/30.
 */
public class ContainerBox implements IBox {
    private List<IBox> boxs = Lists.newArrayList();

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void process() {
        //这里处理自己的业务逻辑
        System.out.println("我是容器box,可以添加其他box");
        System.out.println("当前已经存在的box有" + boxs.size() + "个box");

    }

    public void add(IBox box) {
        if(!boxs.contains(box)) {
            boxs.add(box);
        }
    }

    public void remove(IBox box) {
        if(boxs.contains(box)) {
            boxs.remove(box);
        }
    }

    public boolean isLeaf() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if(null == obj) {
            return false;
        }

        if(!(obj instanceof ContainerBox)) {
            return false;
        }
        ContainerBox other = (ContainerBox) obj;

        return new EqualsBuilder().append(this.id, other.id).build();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.id).build();
    }
}
