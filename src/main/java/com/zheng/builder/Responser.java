package com.zheng.builder;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 该对象为web请求结束时，服务端返回相应消息给客户端的消息数据对象
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
