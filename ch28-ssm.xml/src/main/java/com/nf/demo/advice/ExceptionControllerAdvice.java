package com.nf.demo.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class ExceptionControllerAdvice {

    /**
     * 运行时异常
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    public String handleRuntime(){
        return "error";
    }
}
