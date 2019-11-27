package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public abstract class BaseDao {
    protected JdbcTemplate jdbcTemplate;

    /**
     * set 注入
     * @param jdbcTemplate
     */
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
