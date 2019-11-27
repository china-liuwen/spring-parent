package com.controller.jump;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/jump")
public class JumpController {

    /**
     *      转发（forward）:指的是多个请求方法之间的转发
     * @return
     */
    @RequestMapping("/demo1")
    public String demo1(){
        return "forward:demo2";
    }
    @RequestMapping("/demo2")
    public String demo2(){
        return "view";
    }

    //直接请求此地址,转发到jsp,技术上可行,但不应该这样写,
    //    @Deprecated
    //    @RequestMapping("/demo3")
    //    public String demo3(){
    //        //不要这样写
    //        return "forward:/WEB-INF/views/view.jsp";
    //        //应该这样写
    //        //return "view";
    //    }

    /**
     *  重定向（redirect）:指的是多个请求方法之间的跳转
     */

    //以前缀redirect:修饰,后面跟着的是一个重定向的url地址,
    // 视图解析器直接一句指定的地址加载视图(不加在xml中设定的前后缀值)↓↓↓↓↓

    @RequestMapping("/demo4")
    public String demo4(){
        return "redirect:dis";
    }

    //返回RedirectView时,指定的是跳转的地址,
    //视图解析器直接一句指定的地址加载视图(不加在xml中设定的前后缀值)↓↓↓↓↓

    @RequestMapping("/demo5")
    public RedirectView demo5(){
        RedirectView rv = new RedirectView("dis");
        return rv;
    }

    /**
     *      真正跳去视图的方法
     * @return
     */
    @RequestMapping("/dis")
    public String dis(){
        return "view";
    }


    //// 下面的demo6方法与demo7方法可以直接跳转到jsp,技术上可行,但永远不要这样写,不符合mvc理念
    //    @RequestMapping("/demo6")
    //    @Deprecated
    //    public String demo6(){
    //        return "redirect:/myview.jsp";
    //    }
    //
    //    @RequestMapping("/demo7")
    //    @Deprecated
    //    public RedirectView demo7(){
    //        RedirectView rv = new RedirectView("/myview.jsp");
    //        return  rv;
    //    }
}
