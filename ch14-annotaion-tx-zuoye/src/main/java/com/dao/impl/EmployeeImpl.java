package com.dao.impl;

import com.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeImpl implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void insert() {
        String sql = "insert into employee(username) values(12312312421222)";
        jdbcTemplate.update(sql);
    }
}





















