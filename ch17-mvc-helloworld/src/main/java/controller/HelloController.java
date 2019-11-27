package controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //控制器
//@Component

public class HelloController {

    @RequestMapping("/index")
    public String handle(){
        System.out.println("index------看看他进来了没有，");
        return "hello";
    }

    @RequestMapping("/index2")
    public ModelAndView handle2(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
        mav.addObject("msg","mvc");
        return mav;
    }
}
