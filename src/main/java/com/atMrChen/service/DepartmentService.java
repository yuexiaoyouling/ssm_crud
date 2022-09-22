package com.atMrChen.service;

import com.atMrChen.mapper.DepartmentMapperExt;
import com.atMrChen.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapperExt departmentMapper;



//    public DepartmentService(DepartmentMapperExt departmentMapper) {
//        this.departmentMapper = departmentMapper;
//    }

    /** 查询所有部门 */
    public List<Department> getDepts() {
        return departmentMapper.selectByExample(null);
    }
}