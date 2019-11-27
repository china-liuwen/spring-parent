package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeptServiceImpl {
    private DeptDao deptDao;
    private EmployeeDao employeeDao;

    public DeptServiceImpl(DeptDao deptDao, EmployeeDao employeeDao) {
        this.deptDao = deptDao;
        this.employeeDao = employeeDao;
    }

    /**
     * 事务处理
     */
    @Transactional()
    public void txDemo(){
        deptDao.delete();
        employeeDao.insert();
        System.out.println("操作成功");
    }
}
