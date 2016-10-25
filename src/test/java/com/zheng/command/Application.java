package com.zheng.command;

import org.junit.Test;

/**
 * Created by zhenglian on 2016/10/25.
 */
public class Application {
    @Test
    public void test() {
        //打字任务
        Invoker invoker = new Invoker();
        GeneralCommand command = new GeneralCommand();
        invoker.setCommand(command);

        CommandExecutor printCharsExecutor = new PrintCharsExecutor();
        command.setExecutor(printCharsExecutor);
        invoker.executeCommand();

        CommandExecutor playGameExecutor = new PlayGameExecutor();
        command.setExecutor(playGameExecutor);
        invoker.executeCommand();


    }
}
