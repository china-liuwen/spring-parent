package com.controller;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 拦截器（Interceptor）
 */
public class AuthentictionInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("-----auth---------");
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        if (username == null){
            response.sendRedirect("/login");
            return false;
        }
        return true;
    }
}
