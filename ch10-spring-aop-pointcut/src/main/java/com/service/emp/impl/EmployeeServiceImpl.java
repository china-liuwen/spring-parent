package com.service.emp.impl;

import com.MyAnno;
import com.service.emp.EmployeeService;

public class EmployeeServiceImpl extends AbsEmployeeServiceImpl {
    @Override
    public void getAll() {
        System.out.println("getAll in employeeServiceImpl");
    }

    @Override
    public void getById() {
        System.out.println("getById in employeeServiceImpl");
    }

    @Override
    public void deleteById() {
        System.out.println("deleteById in employeeServiceImpl");
    }

    /**
     * 此方法主要用来测试+这个符号
     */
    public void xxx(){
        System.out.println("xxx");
    }

    @MyAnno
    @Override
    public void update() {
        System.out.println("update in employeeServiceImpl");
    }
}
