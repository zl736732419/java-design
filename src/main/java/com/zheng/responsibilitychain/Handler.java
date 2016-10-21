package com.zheng.responsibilitychain;

/**
 * Created by zhenglian on 2016/10/21.
 */
public interface Handler {
    /**
     * 处理请求
     * @param number
     */
    void handleRequest(String number);

    /**
     * 是否存在下一个对象处理器
     * @return
     */
    boolean hasNextHandler();
}
