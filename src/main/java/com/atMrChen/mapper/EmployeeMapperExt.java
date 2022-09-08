package com.atMrChen.mapper;

import com.atMrChen.pojo.Employee;
import com.atMrChen.pojo.EmployeeExample;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface EmployeeMapperExt extends DepartmentMapper{
    /** 查询满足example条件的员工, 包括所属部门信息 */
    List<Employee> queryByExampleWithDept(EmployeeExample example);

    /** 根据员工id查询员工, 包括所属部门信息 */
    Employee queryByIdWithDept(int empId);
}
