package com.atMrChen.service;

import com.atMrChen.mapper.EmployeeMapperExt;
import com.atMrChen.pojo.Employee;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapperExt employeeMapper;

    //    public PageInfo<Employee> getEmps(int page, int rows) {
//        PageHelper.startPage(page, rows);
//        List<Employee> emps = employeeMapper.queryByExampleWithDept(null);
//        return new PageInfo<>(emps, 5);
//    }
    public void getEmps(int page, int rows) {
        System.out.println(employeeMapper);
    }
}
