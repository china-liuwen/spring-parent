package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import com.entity.EmployeeEntity;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<EmployeeEntity> getAll(int pageNum, int pageSize) {
        return employeeDao.getAll(pageNum,pageSize);
    }

    @Override
    public void txDemo() {
        deptDao.delete();
        employeeDao.insert();
    }
}
