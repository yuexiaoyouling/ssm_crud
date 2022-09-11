package com.atMrChen.exception;

import com.atMrChen.pojo.ErrorCodeEnum;

/**
 * 业务逻辑异常
 * @author OneIce
 * @since 2021/3/26 14:19
 */
public class BusinessException extends RuntimeException {
    private ErrorCodeEnum errorCodeEnum;

    public BusinessException() {
    }

    public BusinessException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.toString());
        this.errorCodeEnum = errorCodeEnum;
    }

    public ErrorCodeEnum getErrorCodeEnum() {
        return errorCodeEnum;
    }
}
