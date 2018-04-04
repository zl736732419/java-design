package com.zheng.builder;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 生成器模式，主要是为了创建一个复杂对象而设计的帮助类模式
 * 主要是为了方便统一对象的创建
 * 将一个复杂对象的创建过程放到一个工具类中完成
 * Created by zhenglian on 2016/10/21.
 */
public class Responser {
    private Integer code; //响应的消息码
    private String message; //响应的消息
    private Boolean status;

    private Responser() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    static class Builder {
        private Responser responser;

        public Builder() {
            responser = new Responser();
        }

        public Builder message(String message) {
            responser.message = message;
            return this;
        }

        public Builder code(Integer code) {
            responser.code = code;
            return this;
        }

        public Builder success() {
            responser.status = Boolean.TRUE;
            code(200);
            message("操作成功!");
            return this;
        }

        public Builder success(String message) {
            success();
            code(200);
            message(message);
            return this;
        }

        public Builder fail() {
            code(500);
            responser.status = Boolean.FALSE;
            message("操作失败!");
            return this;
        }

        public Builder fail(String message) {
            fail();
            message(message);
            return this;
        }

        public Responser build() {
            return responser;
        }
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("code", code).append("message", message)
                .append("status", status).build();
    }
}
