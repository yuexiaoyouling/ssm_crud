package com.atMrChen.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atMrChen.pojo.ErrorCodeEnum;
import com.atMrChen.pojo.Msg;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 处理异常, 返回适当的错误信息给客户端
 * @author OneIce
 * @since 2021/3/29 18:46
 */
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Msg handleException(Exception e) {
        return null;
    }


    @ExceptionHandler(Throwable.class)
    @ResponseBody
    public Msg handlerError() {
        return new Msg(ErrorCodeEnum.SYSTEM_EXECUTION_ERROR);
    }

}
