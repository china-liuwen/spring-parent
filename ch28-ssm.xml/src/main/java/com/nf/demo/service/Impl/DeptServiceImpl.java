package com.nf.demo.service.Impl;

import com.nf.demo.dao.DeptDao;
import com.nf.demo.dao.EmployeeDao;
import com.nf.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void deleteById(int deptid) {
        employeeDao.deleteByDeptId(deptid);
        deptDao.deleteById(deptid);
    }
}
