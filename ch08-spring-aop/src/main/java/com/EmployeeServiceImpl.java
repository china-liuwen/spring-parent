package com;

public class EmployeeServiceImpl {


    /**
     * 因为此类没有实现接口,所以spring利用cglib创建子类的方式来创建出aop代理类
     * 加了final就无法进行代理操作,也就无法织入了.
     */
    public void insert(){
        System.out.println("开始插入insert-------");
    }

    public void update(){
        System.out.println("开始更新update-------");
    }
}
