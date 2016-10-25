package com.zheng.command;

/**
 * 通用命令接口
 * Created by zhenglian on 2016/10/25.
 */
public class GeneralCommand implements Command{
    protected CommandExecutor executor;

    public void setExecutor(CommandExecutor executor) {
        this.executor = executor;
    }

    public void execute() {
        executor.doCommand();
    }
}
