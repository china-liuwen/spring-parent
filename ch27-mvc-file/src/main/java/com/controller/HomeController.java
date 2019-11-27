package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//首页 Home
@Controller
//@MultipartConfig
public class HomeController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
