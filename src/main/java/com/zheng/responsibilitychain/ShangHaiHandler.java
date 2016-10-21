package com.zheng.responsibilitychain;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 判断当前电话号码是否是北京电话号码
 * 如果不是就传递给下一个handler处理
 * Created by zhenglian on 2016/10/21.
 */
public class ShangHaiHandler implements Handler {
    private List<String> numbers = Lists.newArrayList();
    private Handler handler = null;
    public ShangHaiHandler() {
        numbers.add("0987654321");
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public void handleRequest(String number) {
        System.out.println("查找上海电话号码...");
        if(numbers.contains(number)) {
            dealRequest(number);
        }else {
            if(hasNextHandler()) {
                handler.handleRequest(number);
            }
        }
    }

    /**
     * 在当前handler中处理请求
     * @param number
     */
    private void dealRequest(String number) {
        System.out.println("当前用户电话号码为上海电话号码！");
    }

    public boolean hasNextHandler() {
        return handler != null;
    }
}
