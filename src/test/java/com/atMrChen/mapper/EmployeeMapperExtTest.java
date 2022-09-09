package com.atMrChen.mapper;

import com.atMrChen.pojo.Employee;
import com.atMrChen.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mybatis.spring.SqlSessionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class EmployeeMapperExtTest {

    @Test
    public void queryByExampleWithDept() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmployeeMapperExt mapper = sqlSession.getMapper(EmployeeMapperExt.class);
        List<Employee> employees = mapper.queryByExampleWithDept(null);
        System.out.println(employees);

    }

    @Test
    public void queryByIdWithDept() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmployeeMapperExt mapper = sqlSession.getMapper(EmployeeMapperExt.class);
        Employee employee = mapper.queryByIdWithDept(1);
        System.out.println(employee);
    }
}