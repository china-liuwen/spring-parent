package com.service.emp.impl;

import com.service.emp.EmployeeService;

public abstract class AbsEmployeeServiceImpl implements EmployeeService {
    public abstract void update();

    public void insert(){
        System.out.println("insert in AbsEmployeeServiceImpl");
    }
}
