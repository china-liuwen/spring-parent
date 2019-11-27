package com.controller;

import com.vo.UserVO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

public class UserController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/index")
    public String index(UserVO userVO, Model model, HttpSession session){
        String username=userVO.getUsername();

        if (username != null && username.equals("admin")){
            //将用户对象添加到Session中
            session.setAttribute("u",userVO);
            //重定向到主页面的跳转方法
            return "redirect:main";
        }
        model.addAttribute("msg","用户错误重新登录");
        return "index";
    }
    @RequestMapping("/main")
    public String toMain(){
        return "main";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        //清除session
        session.invalidate();
        //重定向到登录页面的跳转方法
        return "redirect:index";
    }
}

























