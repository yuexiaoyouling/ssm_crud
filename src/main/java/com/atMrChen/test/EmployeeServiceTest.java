package com.atMrChen.test;

import com.atMrChen.pojo.Employee;
import com.atMrChen.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeServiceTest {

    @Autowired
    EmployeeService employeeService;
    @Test
    public void getEmps(){

        PageInfo<Employee> emps = employeeService.getEmps(1, 3);
        System.out.println(emps);


    }

}