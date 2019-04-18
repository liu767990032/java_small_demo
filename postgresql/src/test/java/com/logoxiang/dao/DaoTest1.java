package com.logoxiang.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

/**
 * @Author: logoxiang
 * @Date: 2019/4/18 16:02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml" })
public class DaoTest1 {
    @Autowired
    private MyDao myDao;

    @Test
    public void test1(){
        List<Map<String, Object>> list = myDao.findAll();
        System.out.println(list);
    }
}
