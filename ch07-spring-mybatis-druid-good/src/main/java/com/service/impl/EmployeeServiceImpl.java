package com.service.impl;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao dao;

    public void setDao(EmployeeDao dao) {
        this.dao = dao;
    }

    @Override
    public Employee getById() {
        return dao.getById();
    }
}
