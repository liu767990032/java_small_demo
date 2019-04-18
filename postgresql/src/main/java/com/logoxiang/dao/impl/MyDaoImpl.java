package com.logoxiang.dao.impl;

import com.logoxiang.dao.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: logoxiang
 * @Date: 2019/4/18 15:59
 */
@Repository
public class MyDaoImpl implements MyDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Map<String, Object>> findAll() {
        StringBuilder sql = new StringBuilder();
        sql.append("select * from company");
       return jdbcTemplate.queryForList(sql.toString());
    }
}
