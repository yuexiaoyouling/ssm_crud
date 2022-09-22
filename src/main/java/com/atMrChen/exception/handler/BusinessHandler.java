package com.atMrChen.exception.handler;

import com.atMrChen.exception.BusinessException;
import com.atMrChen.pojo.ErrorCodeEnum;
import com.atMrChen.pojo.Msg;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BusinessHandler {

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Msg handlerBusinessException(BusinessException e) {
        return new Msg(e.getErrorCodeEnum());
    }


    @ExceptionHandler(Throwable.class)
    @ResponseBody
    public Msg handlerError() {
        return new Msg(ErrorCodeEnum.SYSTEM_EXECUTION_ERROR);
    }

}
