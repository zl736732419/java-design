package com.zheng.bridge;

import javax.swing.*;

/**
 * 桥接模式中存在多维度变化，只保留其中一维变化，将其他维度的变化都抽象出来形成单独的变化维度
 * Created by zhenglian on 2016/10/30.
 */
public abstract class CCTV extends JPanel {
    /**
     * 节目内容
     */
    protected Program programMaker;

    /**
     * 播放节目的方式
     */
    public abstract void makeProgram();

}
