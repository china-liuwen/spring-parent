package com.advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class MyAdvisor implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor, ThrowsAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("before前置------");
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("returnValue返回通知 = " + returnValue);
    }


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("around before前置");
        Object result = methodInvocation.proceed();
        System.out.println("around after后置");
        return result;
    }

    /**
     * 异常通知接口是个空接口
     *      * 方法的签名必须是:
     *      * 1.返回类型是void
     *      * 2.方法名是afterThrowing
     *      * 3.方法的参数可以是
     *      *  3.1 Method method, Object[] args, Object target
     *      *  3.2 或者Method method, Object[] args, Object target,异常类
     *
     * @param method
     * @param args
     * @param target
     * @param re
     * @throws Throwable
     */
    public void afterThrowing(Method method,Object[] args, Object target, RuntimeException re) throws Throwable{
        System.out.println("throw----" + re.getMessage());
    }
}














