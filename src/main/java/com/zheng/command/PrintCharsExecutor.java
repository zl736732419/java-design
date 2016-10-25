package com.zheng.command;

/**
 * 打字任务执行者
 * Created by zhenglian on 2016/10/25.
 */
public class PrintCharsExecutor implements CommandExecutor {
    public void doCommand() {
        for(int i = 'a'; i <= 'z'; i++) {
            System.out.println((char)i);
        }
    }
}
