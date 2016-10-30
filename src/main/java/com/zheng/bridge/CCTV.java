package com.zheng.bridge;

import javax.swing.*;

/**
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
