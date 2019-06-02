package com.yxm.order.vo;

import lombok.Data;

/**
 * HTTP请求最外层对象
 * @param <T>
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
