package com.service;

import com.entity.EmployeeEntity;

import java.util.List;

public interface DeptService {
    List<EmployeeEntity> getAll(int pageNum,int pageSize);
    void txDemo();
}
