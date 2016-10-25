package com.zheng.command;

/**
 * 命令者，持有命令对象
 * Created by zhenglian on 2016/10/25.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }


}
