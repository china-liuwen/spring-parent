package com.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/view")

public class ViewDemoDontroller {

    /**
     *            ** 转发（forward）到视图 **
     *           有如下：3种方法
     *
     * mvc理念:view视图对象永远不能直接访问,只能直接访问控制器
     * 由控制器去访问view(而且安装servlet技术,基本就是转发到视图)
     * 处理请求方法之间的访问:基本应该都是重定向.
     * @return
     */
    @RequestMapping("/demo1")
    public String demo1(){
        return "view";
    }

    @RequestMapping("/demo2")
    public  String demo2(HttpServletRequest request){
        request.setAttribute("f","sui");
        return "forward:view";
    }

    @RequestMapping("/demo3")
    public ModelAndView demo3(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("view");
        return mav;
    }
    /**
     *   重定向（redirect）:指的是多个请求方法之间的跳转
     *
     *   2种方法
     */
    @RequestMapping("/demo4")
    public String demo4(HttpServletRequest request){
        request.setAttribute("f","sui");
        return "redirect:dis";
    }

    @RequestMapping("/demo5")
    public RedirectView demo5(){
        RedirectView rv = new RedirectView("dis");
        return rv;
    }

    @RequestMapping("/dis")
    public String demo44(){
        return "view";
    }

}


















