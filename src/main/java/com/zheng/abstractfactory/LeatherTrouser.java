package com.zheng.abstractfactory;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 皮鞋
 * Created by zhenglian on 2016/10/23.
 */
public class LeatherTrouser extends Trouser {
    private int chestSize;
    private int height;
    private String name;

    public LeatherTrouser(int chestSize, int height, String name) {
        this.chestSize = chestSize;
        this.height = height;
        this.name = name+"皮鞋";
    }

    public int getChestSize() {
        return chestSize;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void setChestSize(int chestSize) {
        this.chestSize = chestSize;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("chestSize", chestSize)
                .append("height", height).build();
    }
}
