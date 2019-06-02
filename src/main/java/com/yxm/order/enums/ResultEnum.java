package com.yxm.order.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    PARAM_ERROR(0,"参数不正确"),
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
