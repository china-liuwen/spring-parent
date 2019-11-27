package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    /**
     * 这个地方会报404错误,controllerAdvice是不能解决
     * 就要考传统的servlet技术去解决
     * @return
     */
    @RequestMapping("/index1")
    public String index1(){
        return "index1";
    }

    @RequestMapping("/index2")
    public String idex2(){
        throw new ArithmeticException("算数异常");
    }

    @RequestMapping("/index3")
    public String index3(){
        throw new IllegalStateException("无效状态异常");
    }
}
