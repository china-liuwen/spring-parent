package com.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/display")
public class DisplayViewController {

    /**
     *          显示视图（display）
     *          2种方法
     * @return
     */

    @RequestMapping("/demo1")
    public String demo1(){
        return "view";
    }

    @RequestMapping("/demo2")
    public ModelAndView demo2(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("view");
        return mav;
    }
}
