package controller;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 实现拦截器
 */
public class MyFistInterceptor implements HandlerInterceptor {

    //预处理回调方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("first interceptor-------");
        return true;
    }
}
