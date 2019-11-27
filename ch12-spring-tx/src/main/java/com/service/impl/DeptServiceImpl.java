package com.service.impl;

import com.dao.DeptDaoImpl;
import com.dao.EmployeeDaoImpl;

public class DeptServiceImpl {

    private DeptDaoImpl deptDao;
    private EmployeeDaoImpl employeeDao;

    public void setDeptDao(DeptDaoImpl deptDao) {
        this.deptDao = deptDao;
    }

    public void setEmployeeDao(EmployeeDaoImpl employeeDao) {
        this.employeeDao = employeeDao;
    }

    //删除全部ID

    public void deleteWholeDeptById(int id) throws Exception{
        employeeDao.deleteByDeptId(id);
        deptDao.deleteById(id);
    }
}
