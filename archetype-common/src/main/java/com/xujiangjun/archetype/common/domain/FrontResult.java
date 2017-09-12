package com.xujiangjun.archetype.common.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 当 code 为 0 时表示成功，通过 data 字段可获取实际的数据。
 * 当 code 为正数时表示预期失败，通过 message 可获取向用户展示的错误提示。
 * 当 code 为负数时表示意外失败(比如异常、数据库读写错误、服务器忙等)，通过 message 可获取真实错误原因。
 * 注意：当 code 为负数时，前端统一提示"网络错误，请稍后重试"。
 *
 * @author xujiangjun
 * @date 2017-08-21 16:00
 */
@Data
public class FrontResult<T> implements Serializable {

    private static final long serialVersionUID = -6559429767593473325L;

    /** 提示码 **/
    private int code;

    /** 提示信息 **/
    private String message;

    /** 返回数据 **/
    private T data;

    public static <T> FrontResult<T> wrapSuccessfulResult(T data) {
        FrontResult<T> result = new FrontResult<>();
        result.code = 0;
        result.data = data;
        return result;
    }

    public static <T> FrontResult<T> wrapFailureResult(int code, String message) {
        FrontResult<T> result = new FrontResult<>();
        result.code = code;
        result.message = message;
        return result;
    }

    public static <T> FrontResult<T> wrapFailureResult(FrontResult<?> otherResult) {
        FrontResult<T> result = new FrontResult<>();
        result.code = otherResult.getCode();
        result.message = otherResult.getMessage();
        return result;
    }

    public boolean isSuccess() {
        if (this.code == 0) {
            return true;
        }
        return false;
    }

}
