package com.zheng.templatemethod;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 按照修改时间排序
 * Created by zhenglian on 2016/10/30.
 */
public class ModifyDateBasedListDirFile extends ListDirFile {

    public ModifyDateBasedListDirFile(File dir) {
        super(dir);
    }

    protected void sort(File[] files) {
        File tmp = null;
        for(int i = 0; i < files.length; i++) {
            for(int j = i+1; j < files.length; j++) {
                if(files[i].lastModified() < files[j].lastModified()) {
                    tmp = files[i];
                    files[i] = files[j];
                    files[j] = tmp;
                }
            }
        }
    }

    protected void print(File[] files) {
        for(int i = 0; i < files.length; i++) {
            long time = files[i].lastModified();
            Date date = new Date(time);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateTime = format.format(date);
            String name = files[i].getName();
            int k = i+1;
            System.out.println(k + " " + name + " ("+dateTime+")");
        }

    }
}
