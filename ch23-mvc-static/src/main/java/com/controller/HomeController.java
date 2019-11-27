package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * lw
 *
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        System.out.println("request url: /");
        return "index";
    }
    
    @RequestMapping("/demo.css")
    public String getCss(){
        System.out.println("request url: /demo.css");
        return "index";
    }
}




















