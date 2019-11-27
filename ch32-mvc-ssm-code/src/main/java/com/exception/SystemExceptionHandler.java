package com.exception;

import com.vo.ResponseVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 系统异常处理器
 */
@ControllerAdvice
public class SystemExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ResponseVO handleRuntimeException(){
        ResponseVO responseVO = ResponseVO.newBuilder().code("500").msg("failed").data(null).build();
        return responseVO;
    }
}
