package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept")
public class Home5Controller {
//:list/page/100
    //PathVariable

    @RequestMapping("/list/page/{pageNo:\\d}")
    public String index2(){
        return "index";
    }
}
