package com.atMrChen.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void getEmps() {
        System.out.println(employeeService.getEmps(1, 10, null, null));
    }

    @Test
    public void saveEmp() {
    }

    @Test
    public void checkEmpName() {
    }

    @Test
    public void getEmpById() {
    }

    @Test
    public void updateEmp() {
    }

    @Test
    public void deleteEmp() {
    }

    @Test
    public void deleteBatch() {
    }
}