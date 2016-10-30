package com.zheng.templatemethod;

import java.io.File;

/**
 * Created by zhenglian on 2016/10/30.
 */
public abstract class ListDirFile {
    private File dir;
    public ListDirFile(File dir) {
        this.dir = dir;
    }

    public void showFileName() {
        File[] files = dir.listFiles();
        sort(files);
        print(files);
    }

    protected abstract void sort(File[] files);
    protected abstract void print(File[] files);
}
