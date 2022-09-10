package com.atMrChen.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeMapperExtTest {

    @Autowired
    private EmployeeMapperExt employeeMapper;
    @Test
    public void queryByExampleWithDept() {

        System.out.println(employeeMapper.queryByIdWithDept(1));

    }

    @Test
    public void queryByIdWithDept() {
        System.out.println(employeeMapper.queryByExampleWithDept(null));
    }
}