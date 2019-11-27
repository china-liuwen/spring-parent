package com;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.sql.SQLException;

public class LogImpl {

    public void before(JoinPoint joinPoint){
        System.out.println("before*********");
    }
    public void before2(JoinPoint joinPoint){
        System.out.println("before2222*********");
    }

    public void after(){
        System.out.println("after*********");
    }
    public void afterReturn(){
        System.out.println("after return*********");
    }

    public void throwAdvice(SQLException re){
        System.out.println("-----debug: re = " + re);
        System.out.println("throwAdvice*********");
    }

    /**
     * 环绕通知的参数类型是ProceedingJointPoint类型
     * 它是JoinPoint的子类型
     *
     * 但环绕通知的参数不能写为JoinPoint类型
     *
     * joinpoint 连接点
     * around 环绕
     * @param joinpoint
     */
    public Object aroundAdvice(ProceedingJoinPoint joinpoint){

        Object result = null;
        System.out.println("aroundAdvice before*********");
        try {
            //这个代码是让目标方法执行,不调用会导致目标方法不执行
            result = joinpoint.proceed();
//            System.out.println("aroundAdvice return********");
        } catch (Throwable throwable) {
            System.out.println("aroundAdvice throw *********");
        }

        System.out.println("aroundAdvice after*********");
        return result;
    }


    public Object aroundAdvice2(ProceedingJoinPoint joinpoint){

        Object result = null;

        System.out.println("aroundAdvice before222*********");
        try {
            //这个代码是让目标方法执行,不调用会导致目标方法不执行
            result = joinpoint.proceed();
//            System.out.println("aroundAdvice return********");
        } catch (Throwable throwable) {
            System.out.println("aroundAdvice throw2222*********");
        }

        System.out.println("aroundAdvice after222*********");
        return result;
    }
}
